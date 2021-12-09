package fr.m2i.earthquake.dtos.earthquakesDTOS;

public class EarthquakeRelationDTO {

    private String id;

    //Constructors
    public EarthquakeRelationDTO(){
    }

    public EarthquakeRelationDTO(String id){
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
