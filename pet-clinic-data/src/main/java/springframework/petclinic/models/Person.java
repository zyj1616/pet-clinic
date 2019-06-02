package springframework.petclinic.models;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends BaseEntity {

    private String firstName;
    //this annotation is redundant
    @Column(name = "last_name")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
