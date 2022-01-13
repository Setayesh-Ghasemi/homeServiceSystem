package ir.maktab.service.validation;

import ir.maktab.exception.InvalidNameException;
import ir.maktab.exception.InvalidPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidation {

    private static final String PASSWORD_PATTERN = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
    private static final String USERNAME_PATTERN = "^[a-zA-Z]{3,20}";

    public static boolean isUserNameValid(String userName) {
        Pattern userNamePattern = Pattern.compile(USERNAME_PATTERN);
        if ((userName == null))
            return false;
        Matcher userNameMatcher = userNamePattern.matcher(userName);
        if (!userNameMatcher.matches())
            throw new InvalidNameException("Invalid user name");
        return true;
    }

    public static boolean isPasswordValid(String password) {
        Pattern passwordPattern = Pattern.compile(PASSWORD_PATTERN);
        if ((password == null))
            return false;
        Matcher passwordMatcher = passwordPattern.matcher(password);
        if (!passwordMatcher.matches())
            throw new InvalidPasswordException("Invalid password");
        return true;
    }

}
