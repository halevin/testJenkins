package info.telescopeworld.dao;

import info.telescopeworld.models.Mount;
import info.telescopeworld.models.OpticalSystem;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by chalevina on 28/10/2017.
 */
public interface OpticalSystemRepository extends CrudRepository<OpticalSystem, Long> {

    OpticalSystem findByName(String name);

}
