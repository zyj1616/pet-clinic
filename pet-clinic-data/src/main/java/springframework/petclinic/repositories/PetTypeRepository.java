package springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.petclinic.models.PetType;

/**
 * Created by jt on 8/5/18.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
