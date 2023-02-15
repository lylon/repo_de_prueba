package juanpidb_classroom.proyect1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class proyect1Cotroller {
    @GetMapping("greeter")
        public String greeter () {
        return "Hello from GET";

    }
    @PostMapping("greeter")
    public String post(@RequestBody GreeterModel greeterModel) {
        return "hello " + greeterModel.getFirstName();

    }

}
