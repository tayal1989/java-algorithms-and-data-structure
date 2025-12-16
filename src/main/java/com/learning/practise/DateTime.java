package com.learning.practise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        System.out.println(findCurrentDateTime());
    }

    private static String findCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMHHmm");
        String formattedDateTime = now.format(formatter);
        return "99" + formattedDateTime;
    }
}
