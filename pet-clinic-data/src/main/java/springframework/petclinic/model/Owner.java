package springframework.petclinic.model;

import java.util.Set;

public class Owner extends Person {

    private String address;
    private String city;
    private Long telephone;
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
