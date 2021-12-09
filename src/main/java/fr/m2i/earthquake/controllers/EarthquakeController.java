package fr.m2i.earthquake.controllers;

import fr.m2i.earthquake.dtos.earthquakesDTOS.EarthquakeDTO;
import fr.m2i.earthquake.services.EarthquakeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/earthquakes")
public class EarthquakeController {

    //Service declaration
    private EarthquakeService service;

    //Constructor
    public EarthquakeController (EarthquakeService earthquakeService){
        this.service = service;
    }

    //GET
    @GetMapping()
    public List<EarthquakeDTO> findAll(){
        return service.findAll();
    }
}
