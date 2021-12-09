package fr.m2i.earthquake.configurations;

import fr.m2i.earthquake.repositories.LocationRepository;
import fr.m2i.earthquake.services.EarthquakeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EarthquakeConfiguration {

    @Bean
    public EarthquakeService locationService(
            LocationRepository repository,
            ModelMapper mapper
    ){
        return new EarthquakeService(mapper, repository);
    }
}
