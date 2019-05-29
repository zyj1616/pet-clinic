package springframework.petclinic.model;

import java.util.Set;

public class Vet extends Person {

    private Set<Speciallity> speciallities;

    public Set<Speciallity> getSpeciallities() {
        return speciallities;
    }

    public void setSpeciallities(Set<Speciallity> speciallities) {
        this.speciallities = speciallities;
    }
}
