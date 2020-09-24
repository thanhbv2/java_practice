package com.spring.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConverTimeZoned {
  public static void main(String[] args) {
    DateTimeFormatter format = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
    String text = "2019-09-18T19:26:01.010-04:00";
    System.out.println(toUTC(text, format));
    System.out.println("---------------------------");
//		LocalDateTime localDateTime = LocalDateTime
//				.of(LocalDate.parse("2020-09-19", DateTimeFormatter.ofPattern("yyyy-MM-dd")), LocalTime.now().with(LocalTime.MIN))
//				.atOffset(ZoneOffset.of("-05:00"))
//				.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime();
//		System.out.println(localDateTime);
    LocalDateTime localDateTime = LocalDateTime.of(LocalDate.parse("2020-09-19", DateTimeFormatter.ofPattern("yyyy-MM-dd")), LocalTime
        .now().with(LocalTime.MIN));
    System.out.println(ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Kuala_Lumpur")).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    System.out.println(ZonedDateTime.of(localDateTime, ZoneOffset.UTC).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));

//		System.out.println("Instant: parse text " + Instant.parse("2020-09-19"));
    System.out.println("LocalDateTime" + LocalDateTime.now());

  }

  public static LocalDateTime toUTC(String text ,DateTimeFormatter formatter){
    ZoneOffset zoneOffset = ZonedDateTime.parse(text, formatter).getOffset();
    LocalDateTime localDateTime = LocalDateTime.parse(text, formatter);
    OffsetDateTime offsetDateTime = localDateTime.atOffset(zoneOffset);
    return offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime();
  }
}
