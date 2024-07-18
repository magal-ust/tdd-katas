package org.katas.onbording;


import java.util.Locale;
import java.util.regex.Pattern;

public class KataThree {
    public static boolean validatePassword(String password) {
        final StringBuilder errors = new StringBuilder();
        if (password == null || password.length() < 8) {
            errors.append("Password must be at least 8 characters").append("\n");
        }

        if (!checkDigits(password)) {
            errors.append("The password must contain at least 2 numbers").append("\n");
        }

        if (!containsUpperCase(password)) {
            errors.append("Password must contain at least one capital letter").append("\n");
        }

        if (!Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]").matcher(password).find()) {
            errors.append("Password must contain at least one special character").append("\n");
        }

        if(!errors.isEmpty()) {
            throw new IllegalArgumentException(errors.toString());
        }

        return true;
    }

    private static boolean checkDigits(String password) {
        String result = password.replaceAll("\\d", "");
        return password.length() - result.length() >= 2;
    }

    private static boolean containsUpperCase(String value) {
        return !value.equals(value.toLowerCase(Locale.ROOT));
    }

}
