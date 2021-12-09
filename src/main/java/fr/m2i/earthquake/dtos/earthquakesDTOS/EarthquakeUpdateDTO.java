package fr.m2i.earthquake.dtos.earthquakesDTOS;

import fr.m2i.earthquake.dtos.locationDTOS.LocationRelationDTO;

import java.util.Date;

public class EarthquakeUpdateDTO {

    private String id;
    private String nom;
    private int magnitude;
    private LocationRelationDTO location;
    private Date date;

    //Constructors
    public EarthquakeUpdateDTO() {
    }

    public EarthquakeUpdateDTO(String id, String nom, int magnitude, LocationRelationDTO location, Date date) {
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

    public LocationRelationDTO getLocation() {
        return location;
    }

    public void setLocation(LocationRelationDTO location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
