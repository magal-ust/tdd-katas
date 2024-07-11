package org.katas.onbording;


public class KataTwo {
    public static int add(String numbers) {
        final String sep1 = ",";
        final String sep2 = "\n";
        int sum = 0;
        String errors = "";
        if (numbers == null || numbers.isEmpty() || numbers.isBlank()) {
            return sum;
        }
        if (numbers.endsWith(sep1) || numbers.endsWith(sep2)) {
            errors += "Invalid input line";
        }

        String[] nums = numbers.split(sep1 + "|\\" + sep2);
        for (int i = 0; i < nums.length; i++) {
            sum += Integer.parseInt(nums[i]);
        }
        if (!errors.isEmpty() && !errors.isBlank()) {
            throw new IllegalArgumentException(errors);
        }

        return sum;
    }
}
