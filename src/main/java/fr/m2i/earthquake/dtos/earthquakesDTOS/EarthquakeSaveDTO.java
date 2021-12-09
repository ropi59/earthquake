package fr.m2i.earthquake.dtos.earthquakesDTOS;

import fr.m2i.earthquake.dtos.locationDTOS.LocationRelationDTO;


import java.util.Date;

public class EarthquakeSaveDTO {

    private String nom;
    private int magnitude;
    private LocationRelationDTO location;
    private Date date;

    //Constructors
    public EarthquakeSaveDTO() {
    }

    public EarthquakeSaveDTO(String nom, int magnitude, LocationRelationDTO location, Date date) {
        this.nom = nom;
        this.magnitude = magnitude;
        this.location = location;
        this.date = date;
    }

    //Getters & setters
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
