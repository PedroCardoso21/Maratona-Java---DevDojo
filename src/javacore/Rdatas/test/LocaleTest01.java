package javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale LocaleBrazil = new Locale("pt", "BR");
        Locale LocaleJapan = new Locale("ja", "JP");
        Calendar calendar = Calendar.getInstance();

        DateFormat d1 = DateFormat.getDateInstance(DateFormat.FULL, LocaleBrazil);
        DateFormat d3 = DateFormat.getDateInstance(DateFormat.FULL, LocaleJapan);

        System.out.println("Brasil: " + d1.format(calendar.getTime()));
        System.out.println("Japan: " + d3.format(calendar.getTime()));

        System.out.println(LocaleBrazil.getDisplayCountry(LocaleBrazil));
        System.out.println(LocaleBrazil.getDisplayCountry(LocaleJapan));

        System.out.println(LocaleJapan.getDisplayLanguage(LocaleBrazil));
        System.out.println(LocaleBrazil.getDisplayLanguage(LocaleJapan));
    }
}
