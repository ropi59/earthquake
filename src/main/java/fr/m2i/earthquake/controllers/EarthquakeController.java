package fr.m2i.earthquake.controllers;

import fr.m2i.earthquake.dtos.earthquakesDTOS.EarthquakeDTO;
import fr.m2i.earthquake.dtos.earthquakesDTOS.EarthquakeSaveDTO;
import fr.m2i.earthquake.services.EarthquakeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    //POST
    @PostMapping
    public EarthquakeDTO save(@RequestBody EarthquakeSaveDTO earthquake){
        return earthquakeService.save(earthquake);
    }
}
