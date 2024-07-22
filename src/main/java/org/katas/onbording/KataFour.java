package org.katas.onbording;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class KataFour {
    private static final String[] data = new String [] {"Paris", "Budapest","Skopje", "Rotterdam", "Valencia", "Vancouver", "Amsterdam", "Vienna", "Sydney", "New York City", "London", "Bangkok", "Hong Kong", "Dubai", "Rome", "Istanbul"};

    public static List<String> searchBy(String query) {
        final List<String> result = new ArrayList<>();
        Arrays.stream(data).forEach(city -> {
            if (city.toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT))){
                result.add(city);
            }
        });
        return result;
    }
}
