package org.katas.onbording;


public class KataTwo {
    public static int add(String numbers) {
        final String sep1 = ",";
        final String sep2 = "\n";
        String customSep = "";
        int sum = 0;
        String errors = "";
        String negativeNumbers = "";

        if (numbers == null || numbers.isEmpty() || numbers.isBlank()) {
            return sum;
        }
        if (numbers.startsWith("//")) {
            customSep = numbers.split(sep2)[0].replaceAll("//", "");
            numbers = numbers.replaceAll("//"+customSep+sep2,"");
        } else {
        }
        if (numbers.endsWith(sep1) || numbers.endsWith(sep2) ||
                (!customSep.isEmpty() && numbers.endsWith(customSep))) {
            errors += "Invalid input line";
        }

//        final String[] nums = customSep.isEmpty()? numbers.split(sep1 + "|\\" + sep2) : numbers.split(customSep);
        final String[] nums = customSep.isEmpty()? numbers.split(sep1 + "|\\" + sep2) : numbers.split(sep1 + "|\\" + sep2 + "|" + customSep) ;
//        final String[] nums = numbers.split(sep1 + "|\\" + sep2 + "|" + customSep) ;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == null || nums[i].isBlank() || nums[i].isEmpty()) {
                continue;
            }
            try {
                final int digit = Integer.parseInt(nums[i]);
                if (digit < 0) {
                    negativeNumbers += digit + ", ";
                }
                if (digit > 1000) {
                    continue;
                }
                sum += digit;
            } catch (NumberFormatException e) {
                if (nums[i].equals(customSep)) {
                    continue;
                } else {
                    //TODO: support detailed message like “‘|’ expected but ‘,’ found at position 3.”
                    errors += "Detected different delimiters\n";
                }
            }

        }
        if (!negativeNumbers.isEmpty() && !negativeNumbers.isBlank()) {
            errors += "Negative number(s) not allowed: " + negativeNumbers + "\n";
        }
        if (!errors.isEmpty() && !errors.isBlank()) {
            throw new IllegalArgumentException(errors);
        }

        return sum;
    }
}
