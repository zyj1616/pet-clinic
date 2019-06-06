package springframework.petclinic.models;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Builder
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
