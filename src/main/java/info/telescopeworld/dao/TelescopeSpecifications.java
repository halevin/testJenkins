package info.telescopeworld.dao;

import info.telescopeworld.models.*;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chalevina on 28/10/2017.
 */
public class TelescopeSpecifications {

    public static Specification<Telescope> findByCriteria(TelescopeSearchCriteria sc){
        return new Specification<Telescope>() {
            @Override
            public Predicate toPredicate(Root<Telescope> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<Predicate>();
                if (sc.getBrand()!=null){
                    root.fetch(Telescope_.product, JoinType.LEFT);
                    predicates.add(criteriaBuilder.equal(root.get("product.brand"), sc.getBrand()));
                }
                if (sc.getMount()!=null){
                    root.fetch(Telescope_.mount, JoinType.LEFT);
                    predicates.add(criteriaBuilder.equal(root.get("mount"), sc.getMount()));
                }
                if (sc.getOpticalSystem()!=null){
                    root.fetch(Telescope_.opticalSystem, JoinType.LEFT);
                    predicates.add(criteriaBuilder.equal(root.get("opticalSystem"), sc.getOpticalSystem()));
                }
                if (sc.getLowerAperture()!=0){
                    predicates.add(criteriaBuilder.ge(root.get(Telescope_.aperture), sc.getLowerAperture()));
                }
                if (sc.getHigherAperture()!=0){
                    predicates.add(criteriaBuilder.le(root.get(Telescope_.aperture), sc.getHigherAperture()));
                }
                if (sc.getLowerFocus()!=0){
                    predicates.add(criteriaBuilder.ge(root.get(Telescope_.focus), sc.getLowerFocus()));
                }
                if (sc.getHigherFocus()!=0){
                    predicates.add(criteriaBuilder.le(root.get(Telescope_.focus), sc.getHigherFocus()));
                }

                return criteriaBuilder.and(predicates.toArray(new Predicate[] {}));
            }
        };
    }

}
