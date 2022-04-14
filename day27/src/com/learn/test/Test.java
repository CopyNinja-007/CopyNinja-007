package com.learn.test;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class Test implements Serializable {
    public static void main(String[] args) throws FileNotFoundException {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneOffset.of("+8"));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.compareTo(LocalDateTime.now()));
    }
}
