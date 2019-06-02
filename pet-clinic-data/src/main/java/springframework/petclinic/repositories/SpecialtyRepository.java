package springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.petclinic.models.Speciality;

/**
 * Created by jt on 8/5/18.
 */
public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
