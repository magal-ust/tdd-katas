package org.katas.onbording;


public class KataThree {
    public static boolean validatePassword(String password) {
        if (password == null || password.length() < 8) {
            throw  new IllegalArgumentException("Password must be at least 8 characters");
        }
        return true;
    }


}
