package fr.m2i.earthquake.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Earthquake {

    @Id
    private String id;
    private String nom;
    private int magnitude;
    @DBRef
    private Location location;
    private Date date;

    //Constructors
    public Earthquake() {
    }

    public Earthquake(String id, String nom, int magnitude, Location location, Date date) {
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
