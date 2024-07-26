package org.katas.onbording;

import java.util.List;

public class KataFive {
    public static String scan(final List<String> barcodes, boolean total) {
        StringBuilder result = new StringBuilder();
        if (barcodes == null || barcodes.isEmpty() || barcodes.get(0) == null
                || barcodes.get(0).isEmpty() || barcodes.get(0).isBlank()) {
            return "Error: empty barcode";
        }

        if (barcodes.get(0).equals("99999")) {
            result.append("Error: barcode not found");
        }
        if (!result.isEmpty()) {
            return result.toString();
        }

        double price = 0.0;

        for (String barcode: barcodes) {
            if (total == false && price > 0) {
                break;
            }
            if (barcode.equals("12345")) {
                price += 7.25;
            }
            if (barcode.equals("23456")) {
                price += 12.5;
            }
        }

        return result.append("$").append(price).toString();
    }
}
