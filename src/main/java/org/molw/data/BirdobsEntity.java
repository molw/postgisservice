package org.molw.data;

//import org.geolatte.geom.Point;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Point;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by steve on 1/12/2017.
 */
@Entity
@Table(name = "birdobs")
public class BirdobsEntity {
    private String globalUniqueIdentifier;
    private Double taxonomicOrder;
    private String category;
    private String commonName;
    private String scientificName;
    private String subspeciesCommonName;
    private String subspeciesScientificName;
    private Short observationCount;
    private String breedingBirdAtlasCode;
    private String ageSex;
    private String country;
    private String countryCode;
    private String stateProvince;
    private String subnational1Code;
    private String county;
    private String subnational2Code;
    private String ibaCode;
    private String bcrCode;
    private String atlasBlock;
    private String locality;
    private String localityId;
    private String localityType;
    private Point location;
    private Timestamp observationStart;
    private String observerId;
    private String firstName;
    private String lastName;
    private String samplingEventIdentifier;
    private String protocolType;
    private String projectCode;
    private Integer durationMinutes;
    private Float effortDistanceKm;
    private Float effortAreaHa;
    private Integer numberObservers;
    private Boolean allSpeciesReported;
    private String groupIdentifier;
    private Boolean approved;
    private Boolean reviewed;
    private String reason;
    private String tripComments;
    private String speciesComments;


    @Id
    @Column(name = "global_unique_identifier", nullable = false, length = 46)
    public String getGlobalUniqueIdentifier() {
        return globalUniqueIdentifier;
    }

    public void setGlobalUniqueIdentifier(String globalUniqueIdentifier) {
        this.globalUniqueIdentifier = globalUniqueIdentifier;
    }

    @Basic
    @Column(name = "taxonomic_order", nullable = true, precision = 0)
    public Double getTaxonomicOrder() {
        return taxonomicOrder;
    }

    public void setTaxonomicOrder(Double taxonomicOrder) {
        this.taxonomicOrder = taxonomicOrder;
    }

    @Basic
    @Column(name = "category", nullable = true, length = -1)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "common_name", nullable = true, length = -1)
    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    @Basic
    @Column(name = "scientific_name", nullable = true, length = -1)
    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    @Basic
    @Column(name = "subspecies_common_name", nullable = true, length = -1)
    public String getSubspeciesCommonName() {
        return subspeciesCommonName;
    }

    public void setSubspeciesCommonName(String subspeciesCommonName) {
        this.subspeciesCommonName = subspeciesCommonName;
    }

    @Basic
    @Column(name = "subspecies_scientific_name", nullable = true, length = -1)
    public String getSubspeciesScientificName() {
        return subspeciesScientificName;
    }

    public void setSubspeciesScientificName(String subspeciesScientificName) {
        this.subspeciesScientificName = subspeciesScientificName;
    }

    @Basic
    @Column(name = "observation_count", nullable = true)
    public Short getObservationCount() {
        return observationCount;
    }

    public void setObservationCount(Short observationCount) {
        this.observationCount = observationCount;
    }

    @Basic
    @Column(name = "breeding_bird_atlas_code", nullable = true, length = -1)
    public String getBreedingBirdAtlasCode() {
        return breedingBirdAtlasCode;
    }

    public void setBreedingBirdAtlasCode(String breedingBirdAtlasCode) {
        this.breedingBirdAtlasCode = breedingBirdAtlasCode;
    }

    @Basic
    @Column(name = "age_sex", nullable = true, length = -1)
    public String getAgeSex() {
        return ageSex;
    }

    public void setAgeSex(String ageSex) {
        this.ageSex = ageSex;
    }

    @Basic
    @Column(name = "country", nullable = true, length = -1)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "country_code", nullable = true, length = -1)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "state_province", nullable = true, length = -1)
    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    @Basic
    @Column(name = "subnational1_code", nullable = true, length = -1)
    public String getSubnational1Code() {
        return subnational1Code;
    }

    public void setSubnational1Code(String subnational1Code) {
        this.subnational1Code = subnational1Code;
    }

    @Basic
    @Column(name = "county", nullable = true, length = -1)
    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Basic
    @Column(name = "subnational2_code", nullable = true, length = -1)
    public String getSubnational2Code() {
        return subnational2Code;
    }

    public void setSubnational2Code(String subnational2Code) {
        this.subnational2Code = subnational2Code;
    }

    @Basic
    @Column(name = "iba_code", nullable = true, length = -1)
    public String getIbaCode() {
        return ibaCode;
    }

    public void setIbaCode(String ibaCode) {
        this.ibaCode = ibaCode;
    }

    @Basic
    @Column(name = "bcr_code", nullable = true, length = -1)
    public String getBcrCode() {
        return bcrCode;
    }

    public void setBcrCode(String bcrCode) {
        this.bcrCode = bcrCode;
    }

    @Basic
    @Column(name = "atlas_block", nullable = true, length = -1)
    public String getAtlasBlock() {
        return atlasBlock;
    }

    public void setAtlasBlock(String atlasBlock) {
        this.atlasBlock = atlasBlock;
    }

    @Basic
    @Column(name = "locality", nullable = true, length = -1)
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Basic
    @Column(name = "locality_id", nullable = true, length = -1)
    public String getLocalityId() {
        return localityId;
    }

    public void setLocalityId(String localityId) {
        this.localityId = localityId;
    }

    @Basic
    @Column(name = "locality_type", nullable = true, length = -1)
    public String getLocalityType() {
        return localityType;
    }

    public void setLocalityType(String localityType) {
        this.localityType = localityType;
    }

    @Basic
    @Column(name = "location", nullable = true)
    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    @Basic
    @Column(name = "observation_start", nullable = true)
    public Timestamp getObservationStart() {
        return observationStart;
    }

    public void setObservationStart(Timestamp observationStart) {
        this.observationStart = observationStart;
    }

    @Basic
    @Column(name = "observer_id", nullable = true, length = -1)
    public String getObserverId() {
        return observerId;
    }

    public void setObserverId(String observerId) {
        this.observerId = observerId;
    }

    @Basic
    @Column(name = "first_name", nullable = true, length = -1)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = true, length = -1)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "sampling_event_identifier", nullable = true, length = -1)
    public String getSamplingEventIdentifier() {
        return samplingEventIdentifier;
    }

    public void setSamplingEventIdentifier(String samplingEventIdentifier) {
        this.samplingEventIdentifier = samplingEventIdentifier;
    }

    @Basic
    @Column(name = "protocol_type", nullable = true, length = -1)
    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    @Basic
    @Column(name = "project_code", nullable = true, length = -1)
    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    @Basic
    @Column(name = "duration_minutes", nullable = true)
    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Basic
    @Column(name = "effort_distance_km", nullable = true, precision = 0)
    public Float getEffortDistanceKm() {
        return effortDistanceKm;
    }

    public void setEffortDistanceKm(Float effortDistanceKm) {
        this.effortDistanceKm = effortDistanceKm;
    }

    @Basic
    @Column(name = "effort_area_ha", nullable = true, precision = 0)
    public Float getEffortAreaHa() {
        return effortAreaHa;
    }

    public void setEffortAreaHa(Float effortAreaHa) {
        this.effortAreaHa = effortAreaHa;
    }

    @Basic
    @Column(name = "number_observers", nullable = true)
    public Integer getNumberObservers() {
        return numberObservers;
    }

    public void setNumberObservers(Integer numberObservers) {
        this.numberObservers = numberObservers;
    }

    @Basic
    @Column(name = "all_species_reported", nullable = true)
    public Boolean getAllSpeciesReported() {
        return allSpeciesReported;
    }

    public void setAllSpeciesReported(Boolean allSpeciesReported) {
        this.allSpeciesReported = allSpeciesReported;
    }

    @Basic
    @Column(name = "group_identifier", nullable = true, length = -1)
    public String getGroupIdentifier() {
        return groupIdentifier;
    }

    public void setGroupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    @Basic
    @Column(name = "approved", nullable = true)
    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    @Basic
    @Column(name = "reviewed", nullable = true)
    public Boolean getReviewed() {
        return reviewed;
    }

    public void setReviewed(Boolean reviewed) {
        this.reviewed = reviewed;
    }

    @Basic
    @Column(name = "reason", nullable = true, length = -1)
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "trip_comments", nullable = true, length = -1)
    public String getTripComments() {
        return tripComments;
    }

    public void setTripComments(String tripComments) {
        this.tripComments = tripComments;
    }

    @Basic
    @Column(name = "species_comments", nullable = true, length = -1)
    public String getSpeciesComments() {
        return speciesComments;
    }

    public void setSpeciesComments(String speciesComments) {
        this.speciesComments = speciesComments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BirdobsEntity that = (BirdobsEntity) o;

        if (globalUniqueIdentifier != null ? !globalUniqueIdentifier.equals(that.globalUniqueIdentifier) : that.globalUniqueIdentifier != null)
            return false;
        if (taxonomicOrder != null ? !taxonomicOrder.equals(that.taxonomicOrder) : that.taxonomicOrder != null)
            return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (commonName != null ? !commonName.equals(that.commonName) : that.commonName != null) return false;
        if (scientificName != null ? !scientificName.equals(that.scientificName) : that.scientificName != null)
            return false;
        if (subspeciesCommonName != null ? !subspeciesCommonName.equals(that.subspeciesCommonName) : that.subspeciesCommonName != null)
            return false;
        if (subspeciesScientificName != null ? !subspeciesScientificName.equals(that.subspeciesScientificName) : that.subspeciesScientificName != null)
            return false;
        if (observationCount != null ? !observationCount.equals(that.observationCount) : that.observationCount != null)
            return false;
        if (breedingBirdAtlasCode != null ? !breedingBirdAtlasCode.equals(that.breedingBirdAtlasCode) : that.breedingBirdAtlasCode != null)
            return false;
        if (ageSex != null ? !ageSex.equals(that.ageSex) : that.ageSex != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (stateProvince != null ? !stateProvince.equals(that.stateProvince) : that.stateProvince != null)
            return false;
        if (subnational1Code != null ? !subnational1Code.equals(that.subnational1Code) : that.subnational1Code != null)
            return false;
        if (county != null ? !county.equals(that.county) : that.county != null) return false;
        if (subnational2Code != null ? !subnational2Code.equals(that.subnational2Code) : that.subnational2Code != null)
            return false;
        if (ibaCode != null ? !ibaCode.equals(that.ibaCode) : that.ibaCode != null) return false;
        if (bcrCode != null ? !bcrCode.equals(that.bcrCode) : that.bcrCode != null) return false;
        if (atlasBlock != null ? !atlasBlock.equals(that.atlasBlock) : that.atlasBlock != null) return false;
        if (locality != null ? !locality.equals(that.locality) : that.locality != null) return false;
        if (localityId != null ? !localityId.equals(that.localityId) : that.localityId != null) return false;
        if (localityType != null ? !localityType.equals(that.localityType) : that.localityType != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (observationStart != null ? !observationStart.equals(that.observationStart) : that.observationStart != null)
            return false;
        if (observerId != null ? !observerId.equals(that.observerId) : that.observerId != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (samplingEventIdentifier != null ? !samplingEventIdentifier.equals(that.samplingEventIdentifier) : that.samplingEventIdentifier != null)
            return false;
        if (protocolType != null ? !protocolType.equals(that.protocolType) : that.protocolType != null) return false;
        if (projectCode != null ? !projectCode.equals(that.projectCode) : that.projectCode != null) return false;
        if (durationMinutes != null ? !durationMinutes.equals(that.durationMinutes) : that.durationMinutes != null)
            return false;
        if (effortDistanceKm != null ? !effortDistanceKm.equals(that.effortDistanceKm) : that.effortDistanceKm != null)
            return false;
        if (effortAreaHa != null ? !effortAreaHa.equals(that.effortAreaHa) : that.effortAreaHa != null) return false;
        if (numberObservers != null ? !numberObservers.equals(that.numberObservers) : that.numberObservers != null)
            return false;
        if (allSpeciesReported != null ? !allSpeciesReported.equals(that.allSpeciesReported) : that.allSpeciesReported != null)
            return false;
        if (groupIdentifier != null ? !groupIdentifier.equals(that.groupIdentifier) : that.groupIdentifier != null)
            return false;
        if (approved != null ? !approved.equals(that.approved) : that.approved != null) return false;
        if (reviewed != null ? !reviewed.equals(that.reviewed) : that.reviewed != null) return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (tripComments != null ? !tripComments.equals(that.tripComments) : that.tripComments != null) return false;
        if (speciesComments != null ? !speciesComments.equals(that.speciesComments) : that.speciesComments != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = globalUniqueIdentifier != null ? globalUniqueIdentifier.hashCode() : 0;
        result = 31 * result + (taxonomicOrder != null ? taxonomicOrder.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (commonName != null ? commonName.hashCode() : 0);
        result = 31 * result + (scientificName != null ? scientificName.hashCode() : 0);
        result = 31 * result + (subspeciesCommonName != null ? subspeciesCommonName.hashCode() : 0);
        result = 31 * result + (subspeciesScientificName != null ? subspeciesScientificName.hashCode() : 0);
        result = 31 * result + (observationCount != null ? observationCount.hashCode() : 0);
        result = 31 * result + (breedingBirdAtlasCode != null ? breedingBirdAtlasCode.hashCode() : 0);
        result = 31 * result + (ageSex != null ? ageSex.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (stateProvince != null ? stateProvince.hashCode() : 0);
        result = 31 * result + (subnational1Code != null ? subnational1Code.hashCode() : 0);
        result = 31 * result + (county != null ? county.hashCode() : 0);
        result = 31 * result + (subnational2Code != null ? subnational2Code.hashCode() : 0);
        result = 31 * result + (ibaCode != null ? ibaCode.hashCode() : 0);
        result = 31 * result + (bcrCode != null ? bcrCode.hashCode() : 0);
        result = 31 * result + (atlasBlock != null ? atlasBlock.hashCode() : 0);
        result = 31 * result + (locality != null ? locality.hashCode() : 0);
        result = 31 * result + (localityId != null ? localityId.hashCode() : 0);
        result = 31 * result + (localityType != null ? localityType.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (observationStart != null ? observationStart.hashCode() : 0);
        result = 31 * result + (observerId != null ? observerId.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (samplingEventIdentifier != null ? samplingEventIdentifier.hashCode() : 0);
        result = 31 * result + (protocolType != null ? protocolType.hashCode() : 0);
        result = 31 * result + (projectCode != null ? projectCode.hashCode() : 0);
        result = 31 * result + (durationMinutes != null ? durationMinutes.hashCode() : 0);
        result = 31 * result + (effortDistanceKm != null ? effortDistanceKm.hashCode() : 0);
        result = 31 * result + (effortAreaHa != null ? effortAreaHa.hashCode() : 0);
        result = 31 * result + (numberObservers != null ? numberObservers.hashCode() : 0);
        result = 31 * result + (allSpeciesReported != null ? allSpeciesReported.hashCode() : 0);
        result = 31 * result + (groupIdentifier != null ? groupIdentifier.hashCode() : 0);
        result = 31 * result + (approved != null ? approved.hashCode() : 0);
        result = 31 * result + (reviewed != null ? reviewed.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (tripComments != null ? tripComments.hashCode() : 0);
        result = 31 * result + (speciesComments != null ? speciesComments.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return  globalUniqueIdentifier + " : " + commonName + " : " + observationStart + " : " + location;
    }
}
