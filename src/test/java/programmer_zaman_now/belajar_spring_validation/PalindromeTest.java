package programmer_zaman_now.belajar_spring_validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import programmer_zaman_now.belajar_spring_validation.data.Foo;


import java.lang.constant.Constable;
import java.util.Set;
@SpringBootTest
public class PalindromeTest {
    @Autowired
    private Validator validator;
    @Test
    void palindromeValid(){
        Set<ConstraintViolation<Foo>> constraintViolationSet = validator.validate(new Foo("kodok"));
        Assertions.assertTrue(constraintViolationSet.isEmpty());
    }
    @Test
    void palindromeInvalid(){
        Set<ConstraintViolation<Foo>> constraintViolation = validator.validate(new Foo("eko"));
        Assertions.assertFalse(constraintViolation.isEmpty());
        Assertions.assertEquals(1, constraintViolation.size());
    }
    @Test
    void palindromeInvalidMessage(){
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("eko"));
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(1, constraintViolations.size());

        String message = constraintViolations.stream().findFirst().get().getMessage();
        Assertions.assertEquals("Data bukan palindrome", message);
    }
}
