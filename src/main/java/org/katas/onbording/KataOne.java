package org.katas.onbording;

public class KataOne {
    public String fizzBuzz(Integer number) {
        if(number == null) {
            throw new NumberFormatException("Number not set");
        }
        if ((number.intValue() % 3) == 0 && (number.doubleValue() % 5) == 0) {
            return "FizzBuzz";
        }
        if ((number.intValue() % 3) == 0) {
            return "Fizz";
        }
        if ((number.doubleValue() % 5) == 0) {
            return "Buzz";
        }

        return number.toString();
    }
}
