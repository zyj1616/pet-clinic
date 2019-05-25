package springframework.petclinic.bootstrop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springframework.petclinic.services.OwnerService;
import springframework.petclinic.services.map.OwnerMapService;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    public DataLoader(){
        ownerService = new OwnerMapService();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
