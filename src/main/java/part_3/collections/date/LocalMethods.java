package part_3.collections.date;

import java.time.*;

public class LocalMethods {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        LocalDate localDate1 = LocalDate.of(2033, 2, 23);
        System.out.println("localDate1 = " + localDate1);
        localDate1 = LocalDate.of(2020, Month.AUGUST, 20);
        System.out.println("localDate1 = " + localDate1);

        LocalDateTime localDateTime1 = LocalDateTime.of(2022, Month.FEBRUARY, 28, 15, 34);
        System.out.println("localDateTime1 = " + localDateTime1);
    }
}
