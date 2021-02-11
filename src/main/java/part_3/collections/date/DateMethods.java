package part_3.collections.date;

import java.util.Date;

public class DateMethods {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        System.out.println("date = " + date);
        System.out.println("date.getTime() = " + date.getTime());

        long msDay = 24 * 60 * 60 * 1000;
        System.out.println("Years from 1970: " + date.getTime()/msDay/365);


        Date currentTime = new Date();
        Thread.sleep(3000);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("msDelay = " + msDelay + " in ms.");

    }
}
