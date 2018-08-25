package info.telescopeworld.dao;

import info.telescopeworld.models.Price;
import info.telescopeworld.models.Product;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface PriceDao extends CrudRepository<Price, Long> {

  public List<Price> findByProduct(Product product);

}
