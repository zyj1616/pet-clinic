package springframework.petclinic.models;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Builder
@Table(name = "types")
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
