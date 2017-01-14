package org.molw.data;

import org.geolatte.geom.Point;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by steve on 1/12/2017.
 */
@Entity
@Table(name = "marineobs", schema = "public", catalog = "molw")
public class MarineobsEntity {
    private long marineObservationId;
    private String identification;
    private Point location;
    private Timestamp timeOfObservation;
    private Double seaLevelPressure;
    private Short characteristicsOfPressureTendency;
    private Double pressureTendency;
    private Double airTemperature;
    private Double wetBulbTemperature;
    private Double dewPointTemperature;
    private Double seaSurfaceTemperature;
    private String waveDirection;
    private String wavePeriod;
    private Double waveHeight;
    private String swellDirection;
    private String swellPeriod;
    private Double swellHeight;
    private Short totalCloudAmount;
    private Short lowCloudAmount;
    private String lowCloudType;
    private String cloudHeightIndicator;
    private String cloudHeight;
    private String middleCloudType;
    private String highCloudType;
    private String visibility;
    private String visibilityIndicator;
    private String presentWeather;
    private String pastWeather;
    private Integer windDirection;
    private Double windSpeed;

    @Id
    @Column(name = "marine_observation_id", nullable = false)
    public long getMarineObservationId() {
        return marineObservationId;
    }

    public void setMarineObservationId(long marineObservationId) {
        this.marineObservationId = marineObservationId;
    }

    @Basic
    @Column(name = "identification", nullable = true, length = -1)
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
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
    @Column(name = "time_of_observation", nullable = true)
    public Timestamp getTimeOfObservation() {
        return timeOfObservation;
    }

    public void setTimeOfObservation(Timestamp timeOfObservation) {
        this.timeOfObservation = timeOfObservation;
    }

    @Basic
    @Column(name = "sea_level_pressure", nullable = true, precision = 0)
    public Double getSeaLevelPressure() {
        return seaLevelPressure;
    }

    public void setSeaLevelPressure(Double seaLevelPressure) {
        this.seaLevelPressure = seaLevelPressure;
    }

    @Basic
    @Column(name = "characteristics_of_pressure_tendency", nullable = true)
    public Short getCharacteristicsOfPressureTendency() {
        return characteristicsOfPressureTendency;
    }

    public void setCharacteristicsOfPressureTendency(Short characteristicsOfPressureTendency) {
        this.characteristicsOfPressureTendency = characteristicsOfPressureTendency;
    }

    @Basic
    @Column(name = "pressure_tendency", nullable = true, precision = 0)
    public Double getPressureTendency() {
        return pressureTendency;
    }

    public void setPressureTendency(Double pressureTendency) {
        this.pressureTendency = pressureTendency;
    }

    @Basic
    @Column(name = "air_temperature", nullable = true, precision = 0)
    public Double getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(Double airTemperature) {
        this.airTemperature = airTemperature;
    }

    @Basic
    @Column(name = "wet_bulb_temperature", nullable = true, precision = 0)
    public Double getWetBulbTemperature() {
        return wetBulbTemperature;
    }

    public void setWetBulbTemperature(Double wetBulbTemperature) {
        this.wetBulbTemperature = wetBulbTemperature;
    }

    @Basic
    @Column(name = "dew_point_temperature", nullable = true, precision = 0)
    public Double getDewPointTemperature() {
        return dewPointTemperature;
    }

    public void setDewPointTemperature(Double dewPointTemperature) {
        this.dewPointTemperature = dewPointTemperature;
    }

    @Basic
    @Column(name = "sea_surface_temperature", nullable = true, precision = 0)
    public Double getSeaSurfaceTemperature() {
        return seaSurfaceTemperature;
    }

    public void setSeaSurfaceTemperature(Double seaSurfaceTemperature) {
        this.seaSurfaceTemperature = seaSurfaceTemperature;
    }

    @Basic
    @Column(name = "wave_direction", nullable = true, length = -1)
    public String getWaveDirection() {
        return waveDirection;
    }

    public void setWaveDirection(String waveDirection) {
        this.waveDirection = waveDirection;
    }

    @Basic
    @Column(name = "wave_period", nullable = true, length = -1)
    public String getWavePeriod() {
        return wavePeriod;
    }

    public void setWavePeriod(String wavePeriod) {
        this.wavePeriod = wavePeriod;
    }

    @Basic
    @Column(name = "wave_height", nullable = true, precision = 0)
    public Double getWaveHeight() {
        return waveHeight;
    }

    public void setWaveHeight(Double waveHeight) {
        this.waveHeight = waveHeight;
    }

    @Basic
    @Column(name = "swell_direction", nullable = true, length = -1)
    public String getSwellDirection() {
        return swellDirection;
    }

    public void setSwellDirection(String swellDirection) {
        this.swellDirection = swellDirection;
    }

    @Basic
    @Column(name = "swell_period", nullable = true, length = -1)
    public String getSwellPeriod() {
        return swellPeriod;
    }

    public void setSwellPeriod(String swellPeriod) {
        this.swellPeriod = swellPeriod;
    }

    @Basic
    @Column(name = "swell_height", nullable = true, precision = 0)
    public Double getSwellHeight() {
        return swellHeight;
    }

    public void setSwellHeight(Double swellHeight) {
        this.swellHeight = swellHeight;
    }

    @Basic
    @Column(name = "total_cloud_amount", nullable = true)
    public Short getTotalCloudAmount() {
        return totalCloudAmount;
    }

    public void setTotalCloudAmount(Short totalCloudAmount) {
        this.totalCloudAmount = totalCloudAmount;
    }

    @Basic
    @Column(name = "low_cloud_amount", nullable = true)
    public Short getLowCloudAmount() {
        return lowCloudAmount;
    }

    public void setLowCloudAmount(Short lowCloudAmount) {
        this.lowCloudAmount = lowCloudAmount;
    }

    @Basic
    @Column(name = "low_cloud_type", nullable = true, length = -1)
    public String getLowCloudType() {
        return lowCloudType;
    }

    public void setLowCloudType(String lowCloudType) {
        this.lowCloudType = lowCloudType;
    }

    @Basic
    @Column(name = "cloud_height_indicator", nullable = true, length = -1)
    public String getCloudHeightIndicator() {
        return cloudHeightIndicator;
    }

    public void setCloudHeightIndicator(String cloudHeightIndicator) {
        this.cloudHeightIndicator = cloudHeightIndicator;
    }

    @Basic
    @Column(name = "cloud_height", nullable = true, length = -1)
    public String getCloudHeight() {
        return cloudHeight;
    }

    public void setCloudHeight(String cloudHeight) {
        this.cloudHeight = cloudHeight;
    }

    @Basic
    @Column(name = "middle_cloud_type", nullable = true, length = -1)
    public String getMiddleCloudType() {
        return middleCloudType;
    }

    public void setMiddleCloudType(String middleCloudType) {
        this.middleCloudType = middleCloudType;
    }

    @Basic
    @Column(name = "high_cloud_type", nullable = true, length = -1)
    public String getHighCloudType() {
        return highCloudType;
    }

    public void setHighCloudType(String highCloudType) {
        this.highCloudType = highCloudType;
    }

    @Basic
    @Column(name = "visibility", nullable = true, length = -1)
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Basic
    @Column(name = "visibility_indicator", nullable = true, length = -1)
    public String getVisibilityIndicator() {
        return visibilityIndicator;
    }

    public void setVisibilityIndicator(String visibilityIndicator) {
        this.visibilityIndicator = visibilityIndicator;
    }

    @Basic
    @Column(name = "present_weather", nullable = true, length = -1)
    public String getPresentWeather() {
        return presentWeather;
    }

    public void setPresentWeather(String presentWeather) {
        this.presentWeather = presentWeather;
    }

    @Basic
    @Column(name = "past_weather", nullable = true, length = -1)
    public String getPastWeather() {
        return pastWeather;
    }

    public void setPastWeather(String pastWeather) {
        this.pastWeather = pastWeather;
    }

    @Basic
    @Column(name = "wind_direction", nullable = true)
    public Integer getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Integer windDirection) {
        this.windDirection = windDirection;
    }

    @Basic
    @Column(name = "wind_speed", nullable = true, precision = 0)
    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarineobsEntity that = (MarineobsEntity) o;

        if (marineObservationId != that.marineObservationId) return false;
        if (identification != null ? !identification.equals(that.identification) : that.identification != null)
            return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (timeOfObservation != null ? !timeOfObservation.equals(that.timeOfObservation) : that.timeOfObservation != null)
            return false;
        if (seaLevelPressure != null ? !seaLevelPressure.equals(that.seaLevelPressure) : that.seaLevelPressure != null)
            return false;
        if (characteristicsOfPressureTendency != null ? !characteristicsOfPressureTendency.equals(that.characteristicsOfPressureTendency) : that.characteristicsOfPressureTendency != null)
            return false;
        if (pressureTendency != null ? !pressureTendency.equals(that.pressureTendency) : that.pressureTendency != null)
            return false;
        if (airTemperature != null ? !airTemperature.equals(that.airTemperature) : that.airTemperature != null)
            return false;
        if (wetBulbTemperature != null ? !wetBulbTemperature.equals(that.wetBulbTemperature) : that.wetBulbTemperature != null)
            return false;
        if (dewPointTemperature != null ? !dewPointTemperature.equals(that.dewPointTemperature) : that.dewPointTemperature != null)
            return false;
        if (seaSurfaceTemperature != null ? !seaSurfaceTemperature.equals(that.seaSurfaceTemperature) : that.seaSurfaceTemperature != null)
            return false;
        if (waveDirection != null ? !waveDirection.equals(that.waveDirection) : that.waveDirection != null)
            return false;
        if (wavePeriod != null ? !wavePeriod.equals(that.wavePeriod) : that.wavePeriod != null) return false;
        if (waveHeight != null ? !waveHeight.equals(that.waveHeight) : that.waveHeight != null) return false;
        if (swellDirection != null ? !swellDirection.equals(that.swellDirection) : that.swellDirection != null)
            return false;
        if (swellPeriod != null ? !swellPeriod.equals(that.swellPeriod) : that.swellPeriod != null) return false;
        if (swellHeight != null ? !swellHeight.equals(that.swellHeight) : that.swellHeight != null) return false;
        if (totalCloudAmount != null ? !totalCloudAmount.equals(that.totalCloudAmount) : that.totalCloudAmount != null)
            return false;
        if (lowCloudAmount != null ? !lowCloudAmount.equals(that.lowCloudAmount) : that.lowCloudAmount != null)
            return false;
        if (lowCloudType != null ? !lowCloudType.equals(that.lowCloudType) : that.lowCloudType != null) return false;
        if (cloudHeightIndicator != null ? !cloudHeightIndicator.equals(that.cloudHeightIndicator) : that.cloudHeightIndicator != null)
            return false;
        if (cloudHeight != null ? !cloudHeight.equals(that.cloudHeight) : that.cloudHeight != null) return false;
        if (middleCloudType != null ? !middleCloudType.equals(that.middleCloudType) : that.middleCloudType != null)
            return false;
        if (highCloudType != null ? !highCloudType.equals(that.highCloudType) : that.highCloudType != null)
            return false;
        if (visibility != null ? !visibility.equals(that.visibility) : that.visibility != null) return false;
        if (visibilityIndicator != null ? !visibilityIndicator.equals(that.visibilityIndicator) : that.visibilityIndicator != null)
            return false;
        if (presentWeather != null ? !presentWeather.equals(that.presentWeather) : that.presentWeather != null)
            return false;
        if (pastWeather != null ? !pastWeather.equals(that.pastWeather) : that.pastWeather != null) return false;
        if (windDirection != null ? !windDirection.equals(that.windDirection) : that.windDirection != null)
            return false;
        if (windSpeed != null ? !windSpeed.equals(that.windSpeed) : that.windSpeed != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (marineObservationId ^ (marineObservationId >>> 32));
        result = 31 * result + (identification != null ? identification.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (timeOfObservation != null ? timeOfObservation.hashCode() : 0);
        result = 31 * result + (seaLevelPressure != null ? seaLevelPressure.hashCode() : 0);
        result = 31 * result + (characteristicsOfPressureTendency != null ? characteristicsOfPressureTendency.hashCode() : 0);
        result = 31 * result + (pressureTendency != null ? pressureTendency.hashCode() : 0);
        result = 31 * result + (airTemperature != null ? airTemperature.hashCode() : 0);
        result = 31 * result + (wetBulbTemperature != null ? wetBulbTemperature.hashCode() : 0);
        result = 31 * result + (dewPointTemperature != null ? dewPointTemperature.hashCode() : 0);
        result = 31 * result + (seaSurfaceTemperature != null ? seaSurfaceTemperature.hashCode() : 0);
        result = 31 * result + (waveDirection != null ? waveDirection.hashCode() : 0);
        result = 31 * result + (wavePeriod != null ? wavePeriod.hashCode() : 0);
        result = 31 * result + (waveHeight != null ? waveHeight.hashCode() : 0);
        result = 31 * result + (swellDirection != null ? swellDirection.hashCode() : 0);
        result = 31 * result + (swellPeriod != null ? swellPeriod.hashCode() : 0);
        result = 31 * result + (swellHeight != null ? swellHeight.hashCode() : 0);
        result = 31 * result + (totalCloudAmount != null ? totalCloudAmount.hashCode() : 0);
        result = 31 * result + (lowCloudAmount != null ? lowCloudAmount.hashCode() : 0);
        result = 31 * result + (lowCloudType != null ? lowCloudType.hashCode() : 0);
        result = 31 * result + (cloudHeightIndicator != null ? cloudHeightIndicator.hashCode() : 0);
        result = 31 * result + (cloudHeight != null ? cloudHeight.hashCode() : 0);
        result = 31 * result + (middleCloudType != null ? middleCloudType.hashCode() : 0);
        result = 31 * result + (highCloudType != null ? highCloudType.hashCode() : 0);
        result = 31 * result + (visibility != null ? visibility.hashCode() : 0);
        result = 31 * result + (visibilityIndicator != null ? visibilityIndicator.hashCode() : 0);
        result = 31 * result + (presentWeather != null ? presentWeather.hashCode() : 0);
        result = 31 * result + (pastWeather != null ? pastWeather.hashCode() : 0);
        result = 31 * result + (windDirection != null ? windDirection.hashCode() : 0);
        result = 31 * result + (windSpeed != null ? windSpeed.hashCode() : 0);
        return result;
    }
}
