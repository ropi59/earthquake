package fr.m2i.earthquake.services;

import fr.m2i.earthquake.dtos.earthquakesDTOS.EarthquakeDTO;
import fr.m2i.earthquake.entities.Earthquake;
import fr.m2i.earthquake.repositories.EarthquakeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EarthquakeService {

    private EarthquakeRepository repository;
    private ModelMapper mapper;

    public List<EarthquakeDTO> findAll() {
        //List declaration
        List<EarthquakeDTO> earthquakes = new ArrayList<>();
        //Earthquake mapping in EarthquakeDTO.class
        repository.findAll().forEach(earthquake -> {
            earthquakes.add(mapper.map(earthquake, EarthquakeDTO.class));
        });
        return earthquakes;
    }
}
