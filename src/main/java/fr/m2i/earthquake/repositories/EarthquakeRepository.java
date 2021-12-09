package fr.m2i.earthquake.repositories;

import fr.m2i.earthquake.entities.Earthquake;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EarthquakeRepository extends MongoRepository<Earthquake, String> {
}
