package fr.m2i.earthquake.dtos.earthquakesDTOS;

public class EarthquakeDeleteDTO {

    private String id;

    //Constructors
    public EarthquakeDeleteDTO() {
    }

    public EarthquakeDeleteDTO(String id) {
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
