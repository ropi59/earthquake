package fr.m2i.earthquake.dtos.locationDTOS;

import fr.m2i.earthquake.entities.Earthquake;

import java.util.List;

public class LocationDeleteDTO {

    private String id;

    //Constructors
    public LocationDeleteDTO() {
    }

    public LocationDeleteDTO(String id) {
        this.id = id;
    }

    //Getters & setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
