package info.telescopeworld.dao;

import info.telescopeworld.models.Brand;
import info.telescopeworld.models.Telescope;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by chalevina on 28/10/2017.
 */
public interface BrandRepository extends CrudRepository<Brand, Long> {

    Brand findByName(String name);

}
