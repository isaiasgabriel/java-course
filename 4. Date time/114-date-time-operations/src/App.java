import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate referenceDate = LocalDate.parse("2025-05-28");
        LocalDateTime referenceDateTime = LocalDateTime.parse("2025-05-28T11:30:26");
        Instant referenceInstant = Instant.parse("2025-05-28T11:30:26Z");

        LocalDate oneWeekAgoDate = referenceDate.minusDays(7);
        LocalDate oneWeekLaterDate = referenceDate.plusDays(7);

        LocalDateTime oneWeekAgoDateTime = referenceDateTime.minusDays(7);
        LocalDateTime oneWeekLaterDateTime = referenceDateTime.plusDays(7);

        Instant oneWeekAgoInstant = referenceInstant.minus(7, ChronoUnit.DAYS);
        Instant oneWeekLaterInstant = referenceInstant.plus(7, ChronoUnit.DAYS);

        System.out.println("oneWeekAgoDate = " + oneWeekAgoDate);
        System.out.println("oneWeekLaterDate = " + oneWeekLaterDate);

        System.out.println("oneWeekAgoDateTime = " + oneWeekAgoDateTime);
        System.out.println("oneWeekLaterDateTime = " + oneWeekLaterDateTime);

        System.out.println("oneWeekAgoInstant = " + oneWeekAgoInstant);
        System.out.println("oneWeekLaterInstant = " + oneWeekLaterInstant);

        Duration durationBetweenDates = Duration.between(oneWeekAgoDate.atStartOfDay(), referenceDate.atStartOfDay());
        Duration durationBetweenDateTimes = Duration.between(oneWeekAgoDateTime, referenceDateTime);
        Duration durationBetweenInstants = Duration.between(oneWeekAgoInstant, referenceInstant);
        Duration durationReverseInstants = Duration.between(referenceInstant, oneWeekAgoInstant);

        System.out.println("durationBetweenDates days = " + durationBetweenDates.toDays());
        System.out.println("durationBetweenDateTimes days = " + durationBetweenDateTimes.toDays());
        System.out.println("durationBetweenInstants days = " + durationBetweenInstants.toDays());
        System.out.println("durationReverseInstants days = " + durationReverseInstants.toDays());
    }
}
