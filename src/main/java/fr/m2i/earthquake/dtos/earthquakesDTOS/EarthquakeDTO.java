package fr.m2i.earthquake.dtos.earthquakesDTOS;

import fr.m2i.earthquake.dtos.locationDTOS.LocationDTO;

import java.util.Date;

public class EarthquakeDTO {

    private String id;
    private String nom;
    private int magnitude;
    private LocationDTO location;
    private Date date;

    //Constructors
    public EarthquakeDTO() {
    }

    public EarthquakeDTO(String id, String nom, int magnitude, LocationDTO location, Date date) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
        this.location = location;
        this.date = date;
    }

    //Getters & setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }

    public LocationDTO getLocation() {
        return location;
    }

    public void setLocation(LocationDTO location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
