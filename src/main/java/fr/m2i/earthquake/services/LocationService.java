package fr.m2i.earthquake.services;

import fr.m2i.earthquake.repositories.LocationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private LocationRepository repository;
    private ModelMapper mapper;
}
