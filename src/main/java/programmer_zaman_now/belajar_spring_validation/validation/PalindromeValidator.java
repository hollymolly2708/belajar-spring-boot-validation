package programmer_zaman_now.belajar_spring_validation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import programmer_zaman_now.belajar_spring_validation.helper.StringHelper;
@Component
public class PalindromeValidator implements ConstraintValidator<Palindrome, String> {
    @Autowired
    private StringHelper stringHelper;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return stringHelper.isPalindrome(s);
    }
}
