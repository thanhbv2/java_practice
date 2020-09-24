package com.spring.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeExample {

  public static void main(String [] args){
    LocalDate today = LocalDate.now();
    System.out.println("========> Local date "+ today);

    today = LocalDate.of(2014, 1, 1);
    System.out.println("========> Local date "+ today);

    LocalDate tokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));

    System.out.println("Tokyo: "+ tokyo);

    LocalDateTime hcm = LocalDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));

    System.out.println("Time hcm" + hcm);

    LocalDateTime utc = LocalDateTime.now(ZoneId.of("UTC"));

    System.out.println("Time utc" + utc);
  }

}
