package com.spring.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTimeExample {

  public static void main(String[] args) {
    Set<String> allZones = ZoneId.getAvailableZoneIds();
    System.out.println("All Zone" + allZones);

    ZoneId hcm = ZoneId.of("Asia/Ho_Chi_Minh");
    LocalDateTime today = LocalDateTime.now();
    System.out.println("LocalDateTime = " + today);

    ZonedDateTime hcmToday = ZonedDateTime.now(hcm);
    System.out.println("ZoneDateTime hcm: " + hcmToday);

    ZoneOffset offset = ZoneOffset.of("-04:00");
    System.out.println("offset = " + offset);

    OffsetDateTime dateTime = OffsetDateTime.of(today, offset);
    System.out.println("today offset = " + dateTime);

    OffsetDateTime offsetDateTime = dateTime.withOffsetSameInstant(ZoneOffset.ofHours(-2));
    System.out.println("more 2 hours: "+ offsetDateTime);

    Duration duration = Duration.ofDays(3);

    System.out.println("Duration " + duration);



  }

}
