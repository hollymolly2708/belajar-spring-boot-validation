package programmer_zaman_now.belajar_spring_validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import programmer_zaman_now.belajar_spring_validation.data.Person;


import java.util.Set;

@SpringBootTest
public class ValidatorTest {
    @Autowired
    private Validator validator;

    @Test
    void validatePerson() {
        var person = new Person("", "");
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(2, constraintViolations.size());
    }

    @Test
    void personValid() {
        var person = new Person("1", "Eko");
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);
        Assertions.assertTrue(constraintViolations.isEmpty());
    }
}
