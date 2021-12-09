package fr.m2i.earthquake.controllers;

import fr.m2i.earthquake.dtos.earthquakesDTOS.EarthquakeDTO;
import fr.m2i.earthquake.services.EarthquakeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/earthquakes")
public class EarthquakeController {

    //Service declaration
    private EarthquakeService earthquakeService;

    //Constructor
    public EarthquakeController (EarthquakeService earthquakeService){
        this.earthquakeService = earthquakeService;
    }

    //GET
    @GetMapping()
    public List<EarthquakeDTO> findAll(){
        return earthquakeService.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<EarthquakeDTO> getEarthquakeById(@PathVariable String id){
        //service called to get earthquake
        EarthquakeDTO earthquakeDTO = earthquakeService.findById(id);
        if(earthquakeDTO == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(earthquakeDTO);
    }
}
