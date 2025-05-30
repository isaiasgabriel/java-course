import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        // Date and time representations in Java:
        LocalDate day = LocalDate.parse("2025-05-27");
        LocalDateTime dayAndTime = LocalDateTime.parse("2025-05-27T10:15:30");
        Instant globalTime = Instant.parse("2025-05-27T10:15:30Z");

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        // DateTimeFormatter creation:
        // D = day ; M = month ; y = year ; T = time ; Z = timezone
        DateTimeFormatter formatDMY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatDMYT = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm");

        // DateTimeFormatter with timezone:
        // It'll format based on the system's default timezone
        DateTimeFormatter formatDMYTZ = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm")
                .withZone(ZoneId.systemDefault());

        System.out.println("Day: " + day.format(formatDMY));
        System.out.println("Day and Time: " + dayAndTime.format(formatDMYT));
        System.out.println("Global Time: " + formatDMYTZ.format(globalTime));
        // Instant does not have a format function, so we use the formatter with the time inside

        // ISO Date Time:
        DateTimeFormatter isoDateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime isoDateTime = LocalDateTime.parse("2025-05-27T10:15:30");
        System.out.println("ISO Date Time: " + isoDateTime.format(isoDateTimeFormatter));

    }
}
