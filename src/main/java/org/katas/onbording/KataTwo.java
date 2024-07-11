package org.katas.onbording;


public class KataTwo {
    public static int add(String numbers) {
        final String sep1 = ",";
        final String sep2 = "\n";
        int sum = 0;
        String errors = "";
        String negativeNumbers = "";

        if (numbers == null || numbers.isEmpty() || numbers.isBlank()) {
            return sum;
        }
        if (numbers.endsWith(sep1) || numbers.endsWith(sep2)) {
            errors += "Invalid input line";
        }

        String[] nums = numbers.split(sep1 + "|\\" + sep2);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == null || nums[i].isBlank() || nums[i].isEmpty()) {
                continue;
            }
            final int digit = Integer.parseInt(nums[i]);
            if (digit < 0) {
                negativeNumbers += digit + ", ";
            }
            sum += digit;
        }
        if (!negativeNumbers.isEmpty() && !negativeNumbers.isBlank()) {
            errors += "Negative number(s) not allowed: " + negativeNumbers;
        }
        if (!errors.isEmpty() && !errors.isBlank()) {
            throw new IllegalArgumentException(errors);
        }

        return sum;
    }
}
