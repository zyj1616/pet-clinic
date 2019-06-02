package springframework.petclinic.services.springdataJPA;

import org.springframework.stereotype.Service;
import springframework.petclinic.models.Owner;
import springframework.petclinic.repositories.OwnerRepository;
import springframework.petclinic.repositories.PetRepository;
import springframework.petclinic.repositories.PetTypeRepository;
import springframework.petclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

@Service
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String name) {
        return ownerRepository.findByLastName(name);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}