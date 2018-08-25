package info.telescopeworld.dao;

import info.telescopeworld.models.Product;
import info.telescopeworld.models.Telescope;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by chalevina on 28/10/2017.
 */
public interface ProductRepository extends CrudRepository<Product, Long>, JpaSpecificationExecutor {


}
