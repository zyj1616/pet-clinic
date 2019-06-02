package springframework.petclinic.models;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities",joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpeciallities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
