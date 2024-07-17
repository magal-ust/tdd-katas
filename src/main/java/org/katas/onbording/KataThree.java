package org.katas.onbording;


public class KataThree {
    public static boolean validatePassword(String password) {
        final StringBuilder errors = new StringBuilder();
        if (password == null || password.length() < 8) {
            errors.append("Password must be at least 8 characters").append("\n");
        }

        if (!checkDigits(password)) {
            errors.append("The password must contain at least 2 numbers").append("\n");
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

}
