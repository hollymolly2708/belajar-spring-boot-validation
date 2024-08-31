package programmer_zaman_now.belajar_spring_validation.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import programmer_zaman_now.belajar_spring_validation.validation.Palindrome;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foo {
    @Palindrome
    private String bar;
}
