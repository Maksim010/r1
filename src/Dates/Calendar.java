package Dates;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendar {



    public static void main(String[] args) {



        LocalDate date = LocalDate.now();
        System.out.println(date);


        LocalTime time = LocalTime.now();
        System.out.println(time);


        Date dateNow = new Date();
        System.out.println(dateNow);


        LocalDateTime LDT = LocalDateTime.now();
        System.out.println(LDT);


        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatedDate = DTF.format(date);
        System.out.println(formatedDate);
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm").format(LocalDateTime.now()));

        LocalDateTime dateTime = LocalDateTime.parse("2024-02-20T19:34");
        System.out.println(dateTime);


        GregorianCalendar calendar=new GregorianCalendar();



        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yy");
        System.out.println(simpleDateFormat.format(dateNow));


        System.out.println(simpleDateFormat.format(calendar.getTime()));

        TimeZone timeZone=TimeZone.getDefault();
        System.out.println(timeZone);
        System.out.println(TimeZone.getDefault().getDisplayName());
    }
}
