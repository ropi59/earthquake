package fr.m2i.earthquake.services;

import fr.m2i.earthquake.dtos.earthquakesDTOS.EarthquakeDTO;
import fr.m2i.earthquake.dtos.earthquakesDTOS.EarthquakeDeleteDTO;
import fr.m2i.earthquake.dtos.earthquakesDTOS.EarthquakeSaveDTO;
import fr.m2i.earthquake.entities.Earthquake;
import fr.m2i.earthquake.repositories.EarthquakeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EarthquakeService {

    private EarthquakeRepository repository;
    private ModelMapper mapper;

    //GET
    public List<EarthquakeDTO> findAll() {
        //List declaration
        List<EarthquakeDTO> earthquakes = new ArrayList<>();
        //Earthquake mapping in EarthquakeDTO.class
        repository.findAll().forEach(earthquake -> {
            earthquakes.add(mapper.map(earthquake, EarthquakeDTO.class));
        });
        return earthquakes;
    }

    public EarthquakeDTO findById(String id) {
        EarthquakeDTO earthquakeDTO = null;
        //getting earthquake if exist
        Optional<Earthquake> optionalEarthquake = this.repository.findById(id);
        //earthquake checking
        if(optionalEarthquake.isPresent()){
            Earthquake earthquake = optionalEarthquake.get();
            //Entity Earthquake mapping in EarthquakeDTO
            earthquakeDTO = mapper.map(earthquake, EarthquakeDTO.class);
        }
        return earthquakeDTO;
    }

    //POST
    public EarthquakeDTO save(EarthquakeSaveDTO obj) {
        Earthquake earthquakeToSave = mapper.map(obj, Earthquake.class);
        Earthquake earthquake = repository.save(earthquakeToSave);
        EarthquakeDTO earthquakeSaved = mapper.map(earthquake, EarthquakeDTO.class);
        return earthquakeSaved;
    }

    //PUT
    public EarthquakeDTO update(EarthquakeSaveDTO earthquakeDTO) {
        //Entity mapping in DTO
        Earthquake earthquakeToUpdate = mapper.map(earthquakeDTO, Earthquake.class);
        Earthquake earthquakeSaved = repository.save(earthquakeToUpdate);
        //earthquakeSaved mapping in EarthquakeDTO
        EarthquakeDTO earthquakeReturned = mapper.map(earthquakeSaved, EarthquakeDTO.class);
        return earthquakeReturned;
    }

    //DELETE
    public void deleteById(EarthquakeDeleteDTO obj){
        Earthquake earthquakeToSave = mapper.map(obj, Earthquake.class);
        repository.deleteById(earthquakeToSave.getId());
    }
}
