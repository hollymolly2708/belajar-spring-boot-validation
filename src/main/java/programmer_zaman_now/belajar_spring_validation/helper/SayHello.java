package programmer_zaman_now.belajar_spring_validation.helper;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Set;


@Component
@Validated
public class SayHello {
    public String sayHello(@NotBlank String name) {
        return "Hello " + name;
    }
}

