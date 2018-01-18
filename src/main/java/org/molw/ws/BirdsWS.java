/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.molw.ws;

import org.molw.data.BirdobsEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.persistence.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * A simple REST service which is able to say hello to someone using HelloService Please take a look at the web.xml where JAX-RS
 * is enabled
 *
 * @author spousty@redhat.com
 *
 */

@Path("birds")
public class BirdsWS {

    //Need @ApplicationScoped to get this class to be part of CDI
    @ApplicationScoped

    //Let CDI bring the PersistenceContext
    @PersistenceContext(unitName = "molw")
    private EntityManager em;
    

    @GET
    @Path("/byobserver/{id}")
    @Produces({"application/json"})
    public ArrayList getObserverByID(@PathParam("id") String id) throws NamingException{
        ArrayList results = new ArrayList();
        List<BirdobsEntity> birds;
        birds = em.createQuery("SELECT b FROM BirdobsEntity b WHERE b.observerId = :id ").setParameter("id", id).getResultList();

        Iterator<BirdobsEntity> birdIterator = birds.iterator();
        while (birdIterator.hasNext()){
            HashMap<String, Object> result = new HashMap<String, Object>();
            BirdobsEntity bird = birdIterator.next();

            //Deal with the coords
            ArrayList<String> coordArray = new ArrayList<String>();

            String coords = bird.getLocation().getCoordinate().toString().replaceFirst(", NaN", "");
            //"(-121.9602598, 36.9653195)"
            int firstComma = coords.indexOf(',');
            coordArray.add(coords.substring(1, firstComma));
            coordArray.add(coords.substring(firstComma+1, coords.length()-1));
            result.put("coords", coordArray);
            result.put("id", bird.getObserverId());
            result.put("commonName", bird.getCommonName());
            result.put("startTime", bird.getObservationStart().toString());
            results.add(result);
        }


        em.close();
        return results;

    }

    @GET
    @Path("byspecies/{commonName}")
    @Produces({ "application/json" })
    public  ArrayList getRecordsByCommonName(@PathParam("commonName") String commonName) throws NamingException{
        List<BirdobsEntity> birds;
        birds = em.createQuery("SELECT b FROM BirdobsEntity b WHERE b.commonName = :commonName ").setParameter("commonName", commonName).getResultList();

        ArrayList results = new ArrayList();
        Iterator<BirdobsEntity> birdIterator = birds.iterator();
        while (birdIterator.hasNext()){
            HashMap<String, Object> result = new HashMap<String, Object>();
            BirdobsEntity bird = birdIterator.next();

            //Deal with the coords
            ArrayList<String> coordArray = new ArrayList<String>();

            String coords = bird.getLocation().getCoordinate().toString().replaceFirst(", NaN", "");
            //"(-121.9602598, 36.9653195)"
            int firstComma = coords.indexOf(',');
            coordArray.add(coords.substring(1, firstComma));
            coordArray.add(coords.substring(firstComma+1, coords.length()-1));
            result.put("coords", coordArray);
            result.put("commonName", bird.getCommonName());
            Short numberSeen = bird.getObservationCount();
            if (numberSeen != null){
                result.put("numberSeen", numberSeen.toString());
            } else {
                result.put("numberSeen", "NA");
            }

            result.put("startTime", bird.getObservationStart().toString());
            results.add(result);
        }


        em.close();
        return results;
    }


    @GET
    @Path("fivebirds")
    @Produces({ "application/json" })
    public String getFiveBirds() throws NamingException {
        List<BirdobsEntity> birds;
        birds = em.createQuery("SELECT b FROM BirdobsEntity b ").setMaxResults(5).getResultList();


        return birds.get(0).toString();
    }

    @GET
    @Path("json")
    @Produces({ "application/json" })
    public String getHelloWorldJSON() {
        System.out.printf("Hellow world from JSON");
        return "{\"result\":\"" + "World" + "\"}";
    }

    @GET
    @Path("xml")
    @Produces({ "application/xml" })
    public String getHelloWorldXML() {
        return "<xml><result>world</result></xml>";
    }

}
