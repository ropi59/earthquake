package fr.m2i.earthquake.dtos.locationDTOS;

import fr.m2i.earthquake.entities.Earthquake;

import java.util.List;

public class LocationRelationDTO {

    private String id;

    //Constructors
    public LocationRelationDTO() {
    }

    public LocationRelationDTO(String id, String name, String code, List<Earthquake> earthquakes) {
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
