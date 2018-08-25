package info.telescopeworld.dao;

import info.telescopeworld.models.Brand;
import info.telescopeworld.models.Mount;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by chalevina on 28/10/2017.
 */
public interface MountRepository extends CrudRepository<Mount, Long> {

    Mount findByName(String name);

}
