package org.katas.onbording;


public class KataThree {
    public static boolean validatePassword(String password) {
        if (password == null || password.length() < 8) {
            throw  new IllegalArgumentException("Password must be at least 8 characters");
        }

        if (!checkDigits(password)) {
            throw  new IllegalArgumentException("The password must contain at least 2 numbers");
        }

        return true;
    }

    private static boolean checkDigits(String password) {
        String result = password.replaceAll("\\d", "");
        return password.length() - result.length() >= 2;
    }

}
