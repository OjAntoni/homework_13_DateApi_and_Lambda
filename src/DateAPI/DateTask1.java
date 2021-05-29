package DateAPI;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTask1 {
    public static void main(String[] args) {
        System.out.println("Today: "+getDayOfWeek(new Date()));
        System.out.println("Somewhen after 200.000.000 mls after unix era staretd: "+ getDayOfWeek(new Date(200_000_000L)));
        System.out.println("Somewhen after 200.000.000+9.000.000.000 mls after unix era staretd: "+ getDayOfWeek(new Date(200_000_000L+9_000_000_000L)));
        System.out.println("On 12th June 2022: " + getDayOfWeek(new Date(2022, Calendar.JUNE, 12)));
    }

    /**
     * Метод возвращает название дня недели для даты
     * @param date дата, которую обработает метод
     * @return строку с название дня недели для даты
     */
    private static String getDayOfWeek(Date date){
        SimpleDateFormat dataFormat = new SimpleDateFormat("E");
        return dataFormat.format(date);
    };
}
