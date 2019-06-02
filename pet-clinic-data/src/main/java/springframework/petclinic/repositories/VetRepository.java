package springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.petclinic.models.Vet;

/**
 * Created by jt on 8/5/18.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
