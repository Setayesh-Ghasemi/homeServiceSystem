/*
package ir.maktab.service.validation;

import ir.maktab.exception.InvalidNameException;
import ir.maktab.exception.InvalidPasswordException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ValidationTest {
    @ParameterizedTest
    @CsvSource({"setayesh", "amirAli"})
    void getUserName_ReturnTrueResult(String name) {
        boolean result = CheckValidation.isUserNameValid(name);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"se", "saraW123"})
    void getUserName_ThrowExceptionResult(String name) {
        InvalidNameException exp = Assertions.assertThrows(InvalidNameException.class, () ->
                CheckValidation.isUserNameValid(name));
        System.out.println(exp.getMessage());
        Assertions.assertEquals("invalid user name", exp.getMessage());
    }

    @ParameterizedTest
    @CsvSource({"set1234", "67854"})
    void getUserAndPass_throwExceptionResult(String pass) {
        InvalidPasswordException exp = Assertions.assertThrows(InvalidPasswordException.class, () ->
                CheckValidation.isPasswordValid(pass));
        System.out.println(exp.getMessage());
        Assertions.assertEquals("invalid password", exp.getMessage());
    }

    @ParameterizedTest
    @CsvSource({"sEta87655G", "76544Sgha"})
    void getPassword_ReturnTrueResult(String pass) {
        boolean result = CheckValidation.isPasswordValid(pass);
        Assertions.assertTrue(result);
    }

}
*/
