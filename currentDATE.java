import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class currentDATE {
    public static void main(String[] args) {
        // current date time formater
        Date date=new Date();
        System.out.println(date);
        DateFormat formate=new SimpleDateFormat("dd/MM/YYYY");
        String cur=formate.format(date);
        System.out.println("After formating date: "+cur);

        //local time date formate

        LocalTime time=LocalTime.now();
        System.out.println("Loccal time "+time);
        DateTimeFormatter  fo=DateTimeFormatter.ofPattern("hh:mm:ss");

        String sss=time.format(fo);
        System.out.println(sss);
    }
}
