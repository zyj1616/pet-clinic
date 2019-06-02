package springframework.petclinic.services;

import springframework.petclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String name);
}
