package springframework.petclinic.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "owners")
public class Owner extends Person {

    private String address;
    private String city;
    private Long telephone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> Pets;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return Pets;
    }

    public void setPets(Set<Pet> pets) {
        Pets = pets;
    }
}
