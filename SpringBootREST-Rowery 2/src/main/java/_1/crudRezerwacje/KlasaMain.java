
package _1.crudRezerwacje;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.Collections;


@SpringBootApplication
public class KlasaMain {

    public static void main(String args[]) {
        
        SpringApplication app = new SpringApplication(KlasaMain.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
        app.run(args);
        
    }
}
