package fr.m2i.earthquake.dtos.locationDTOS;

import fr.m2i.earthquake.entities.Earthquake;

import java.util.List;

public class LocationUpdateDTO {

    private String id;
    private String name;
    private String code;
    private List<Earthquake> earthquakes;

    //Constructors
    public LocationUpdateDTO() {
    }

    public LocationUpdateDTO(String id, String name, String code, List<Earthquake> earthquakes) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.earthquakes = earthquakes;
    }

    //Getters & setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Earthquake> getEarthquakes() {
        return earthquakes;
    }

    public void setEarthquakes(List<Earthquake> earthquakes) {
        this.earthquakes = earthquakes;
    }
}
