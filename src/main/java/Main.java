import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime= LocalDateTime.now();

        ZonedDateTime gmtDateTime = dateTime.atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneId.of("GMT"));

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter dateFormat2 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern(("E, MMM dd, yyyy    HH:mm"));
        DateTimeFormatter timeChallenge = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter dateChallenge = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        System.out.println("Date: " + date.format(dateFormat));
        System.out.println("Date: " + date);
        System.out.println("Date: " + date.format(dateFormat2));
        System.out.println("Date & Time in GMT: " + gmtDateTime.format(dateTimeFormat));
        System.out.println(time.format(timeChallenge) + " on " + date.format(dateChallenge));
    }
}
