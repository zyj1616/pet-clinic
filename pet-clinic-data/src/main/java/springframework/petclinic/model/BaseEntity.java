package springframework.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    //Long can be null
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
