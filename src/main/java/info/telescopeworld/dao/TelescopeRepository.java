package info.telescopeworld.dao;

import info.telescopeworld.models.Telescope;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by chalevina on 28/10/2017.
 */
public interface TelescopeRepository  extends CrudRepository<Telescope, Long>, JpaSpecificationExecutor {


}
