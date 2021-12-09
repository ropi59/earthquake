package fr.m2i.earthquake.dtos.earthquakesDTOS;

import fr.m2i.earthquake.entities.Location;

import java.util.Date;

public class EarthquakeSaveDTO {

    private String nom;
    private int magnitude;
    private Location location;
    private Date date;

    //Constructors
    public EarthquakeSaveDTO() {
    }

    public EarthquakeSaveDTO(String nom, int magnitude, Location location, Date date) {
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
