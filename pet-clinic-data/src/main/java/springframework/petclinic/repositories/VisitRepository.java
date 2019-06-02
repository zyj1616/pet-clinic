package springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.petclinic.models.Visit;

/**
 * Created by jt on 8/5/18.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
