import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        // LocalDate & LocalDateTime
        // toString() está sendo feita implicitamente em todos os prints
        // e ao printar elas são formatadas na ISO 8601
        LocalDate date01 = LocalDate.now();
        LocalDateTime date02 = LocalDateTime.now();
        System.out.println("LocalDate: " + date01);
        System.out.println("LocalDateTime: " + date02);
        System.out.println("-------------------------");

        // LocalDate.parse
        LocalDate brazilDiscoveryDay = LocalDate.parse("1500-04-22");
        LocalDateTime brazilDiscoveryDayTime = LocalDateTime.parse("1500-04-22T09:30:29");
        System.out.println("Brazil's discovery day: " + brazilDiscoveryDay);
        System.out.println("Brazil's discovery day-time: " + brazilDiscoveryDayTime);
        System.out.println("-------------------------");

        // Global Time - Instant
        Instant globalDateTime = Instant.now();
        System.out.println("Global time (Instant): " + globalDateTime);
        System.out
                .println("Z = Zulu time (UTC) means the current time in Greenwich(GMT pattern, same as UTC), England.");

        System.out.println("-------------------------");

        // Global Time Parse - Instant.parse
        Instant todayZuluTime = Instant.parse("2024-05-27T09:30:00Z");
        System.out.println("Zulu time (UTC) parsed: " + todayZuluTime);
        System.out.println("-------------------------");

        // Parsing a Brazil time to UTC
        // Note: Brazil is in UTC-3, so we need to adjust the time accordingly
        Instant todayBrazilTime = Instant.parse("2024-05-27T09:30:00-03:00");
        System.out.println("Brazil time (UTC-3) before parsing: 2024-05-27T09:30:00-03:00");
        System.out.println("Brazil time (UTC-3) parsed to Zulu: " + todayBrazilTime);
        System.out.println("-------------------------");

        // Custom parsing
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate customDate = LocalDate.parse("27/05/2024", fmt1);
        System.out.println("Custom local date parsed (dd/MM/yyyy): " + customDate);
        System.out.println("-------------------------");

        // Custom parsing with LocalDateTime
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime customDateTime = LocalDateTime.parse("27/05/2024 09:30", fmt2);
        System.out.println("Custom local date-time parsed (dd/MM/yyyy HH:mm): " + customDateTime);
        System.out.println("-------------------------");

        // Custom parsing directly without fmt object
        LocalDateTime customDateTimeDirect = LocalDateTime.parse("27/05/2024 09:30",
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Custom local date-time parsed directly (dd/MM/yyyy HH:mm): " + customDateTimeDirect);

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();

        // LocalDateTime.of() function
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 5, 27, 9, 30);
        System.out.println("Specific date-time using LocalDateTime.of(): " + specificDateTime);

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();

        System.out.println("Instant (Global time) variable: " + globalDateTime);

        // Instant (Global time) to LocalDateTime conversion
        LocalDateTime localDateTimeFromInstant = LocalDateTime.ofInstant(globalDateTime, ZoneId.systemDefault());
        System.out.println("LocalDateTime in Brazil from Instant: " + localDateTimeFromInstant);

        // Instant (Global time) to LocalDateTime conversion
        LocalDateTime portugalTime = LocalDateTime.ofInstant(globalDateTime, ZoneId.of("Portugal"));
        System.out.println("LocalDateTime in Portugal from Instant: " + portugalTime);

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();

        // Extracting day, month year from LocalDate
        System.out.println("Day: " + date01.getDayOfMonth());
        System.out.println("Month: " + date01.getMonthValue());
        System.out.println("Year: " + date01.getYear());
    }
}
