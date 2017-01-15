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

import javax.inject.Inject;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
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

    private EntityManager em;

    protected EntityManager getEntityManager() throws NamingException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("molw");
        return emf.createEntityManager();
    }

    @GET
    @Path("byspecies/{commonName}")
    @Produces({ "application/json" })
    public  ArrayList getRecordsByCommonName(@PathParam("commonName") String commonName) throws NamingException{
        List<BirdobsEntity> birds;
        em = getEntityManager();
        em.getTransaction().begin();
        birds = em.createQuery("SELECT b.commonName, b.observationCount, b.observationStart, b.location  FROM BirdobsEntity b WHERE b.commonName = :commonName ").setParameter("commonName", commonName).getResultList();
        em.getTransaction().commit();

        ArrayList results = new ArrayList();
        Iterator<BirdobsEntity> birdIterator = birds.iterator();
        while (birdIterator.hasNext()){
            HashMap<String, String> result = new HashMap<String, String>();
            BirdobsEntity bird = birdIterator.next();
            String coords = bird.getLocation().getCoordinate().toString().replaceFirst(", NaN", "");
            result.put("coords", coords);
            result.put("commonName", bird.getCommonName());
            result.put("numberSeen", Short.toString(bird.getObservationCount()));
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
        em = getEntityManager();
        em.getTransaction().begin();
        birds = em.createQuery("SELECT b FROM BirdobsEntity b ").setMaxResults(5).getResultList();
        em.getTransaction().commit();
        em.close();


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
