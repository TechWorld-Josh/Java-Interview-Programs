package org.techworldwithjosh._2.data_structure;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        // Current date
        LocalDate date = LocalDate.now();
        System.out.println("Default: " + date);

        // Format date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted: " + formattedDate);

        // Current date-time
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(dtFormatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        // Parse string to date
        String dateStr = "15-08-2025";
        LocalDate parsedDate = LocalDate.parse(dateStr, formatter);
        System.out.println("Parsed Date: " + parsedDate);
    }
}
