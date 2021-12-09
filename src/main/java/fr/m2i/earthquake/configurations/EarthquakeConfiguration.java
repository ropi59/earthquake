package fr.m2i.earthquake.configurations;

import fr.m2i.earthquake.repositories.LocationRepository;
import fr.m2i.earthquake.services.LocationService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocationConfiguration {

    @Bean
    public LocationService locationService{
            LocationRepository repository,
            ModelMapper mapper
    }{
        return new LocationService(mapper, repository);
    }
}
