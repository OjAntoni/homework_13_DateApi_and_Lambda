package DateAPI;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

//Класс находит дату следующего вторника
public class DateTask2 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        SimpleDateFormat nowFormat = new SimpleDateFormat("d.MM.y");
        //если сегодня вторник, то перепрыгиваем на завтра
        if(date.getDayOfWeek().equals(DayOfWeek.TUESDAY)){
            date = date.plusDays(1);
        }
        //пока не встретим вторник, перепрыгиваем на следующий день
        while (!date.getDayOfWeek().equals(DayOfWeek.TUESDAY)){
            date = date.plusDays(1);
        }

        System.out.println("Следующий вторник - это "+date);

    }

}
