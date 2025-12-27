package com.practice.optionalpack;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();//get today's date
        System.out.println("the current date is " + date);
        LocalTime time=LocalTime.now();
        System.out.println("the current time is " + time);//get current time
        LocalDateTime current=LocalDateTime.now();
        System.out.println("the current date n time  is " + current);//get current date time
        // -------- FORMATTING -------- ,Define format pattern
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        // Apply format to current
        String formattedDateTime=current.format(format);
        System.out.println("in formatted manner " + formattedDateTime);
        Month month=current.getMonth();
        int day=current.getDayOfMonth();
        int seconds=current.getSecond();
         System.out.println("Month : " + month +" day : " + day +
         " seconds : " + seconds);
         ZonedDateTime currentZone=ZonedDateTime.now();
         System.out.println("the current zone is " +currentZone.getZone());
         ZoneId zoneid=ZoneId.of("Asia/Kolkata");
         ZonedDateTime indiatime=ZonedDateTime.now(zoneid);
         System.out.println("India time : " + indiatime);

    }
}
