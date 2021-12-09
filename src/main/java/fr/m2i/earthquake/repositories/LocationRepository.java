package fr.m2i.earthquake.repositories;

import fr.m2i.earthquake.entities.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location, String> {
}
