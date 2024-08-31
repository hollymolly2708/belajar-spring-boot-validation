package programmer_zaman_now.belajar_spring_validation.helper;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Component
public class SayHello implements ISayHello {
    public String sayHello( String name) {
        return "Hello " + name;
    }
}

