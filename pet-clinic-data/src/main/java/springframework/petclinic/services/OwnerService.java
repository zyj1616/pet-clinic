package springframework.petclinic.services;

import springframework.petclinic.models.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

    void deleteById(Long aLong);
 }
