package fr.m2i.earthquake.services;

import fr.m2i.earthquake.repositories.EarthquakeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EarthquakeService {

    private EarthquakeRepository repository;
    private ModelMapper mapper;
}
