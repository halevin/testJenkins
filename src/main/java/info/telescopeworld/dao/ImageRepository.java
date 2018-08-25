package info.telescopeworld.dao;

import info.telescopeworld.models.Brand;
import info.telescopeworld.models.Image;
import info.telescopeworld.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by chalevina on 28/10/2017.
 */
public interface ImageRepository extends CrudRepository<Image, Long> {

    List<Image> findByProduct(Product product);
    List<Image> findByProductAndScope(Product product, Boolean scope);


}
