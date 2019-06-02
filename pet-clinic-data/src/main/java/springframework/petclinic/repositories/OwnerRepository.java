package springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.petclinic.models.Owner;

import java.util.List;

/**
 * Created by jt on 8/5/18.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}