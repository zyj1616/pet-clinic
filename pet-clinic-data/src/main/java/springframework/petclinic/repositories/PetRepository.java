package springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.petclinic.models.Pet;

/**
 * Created by jt on 8/5/18.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
