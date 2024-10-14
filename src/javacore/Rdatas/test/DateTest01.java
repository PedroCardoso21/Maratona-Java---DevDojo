package javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(40); // long 01/01/1970
        date.setTime(date.getTime() + 3600000);
        System.out.println(date);
    }
}
