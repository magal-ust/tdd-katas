package org.katas.onbording;


public class KataTwo {
    public static int add(String numbers) {
        int sum = 0;
        if (numbers == null || numbers.isEmpty() || numbers.isBlank()) {
            return sum;
        }
        String[] nums = numbers.split(",");
        for (int i = 0; i < nums.length; i++) {
            sum += Integer.parseInt(nums[i]);
        }
        return sum;
    }
}
