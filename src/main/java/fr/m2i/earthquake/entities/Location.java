package fr.m2i.earthquake.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Location {

    @Id
    private String id;
    private String name;
    private String code;
    @DBRef
    private List<Earthquake> earthquakes;

    //Constructors
    public Location() {
    }

    public Location(String id, String name, String code, List<Earthquake> earthquakes) {
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
