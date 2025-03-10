import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {

        //DATA HORA
        System.out.println("data-hora");
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now(); //horario global

        System.out.println("d01: " + d01);
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03);
        System.out.println();

        //TEXTO ISO  8601
        System.out.println("texto iso 8601");
        LocalDate d04 = LocalDate.parse("2025-05-10");
        System.out.println("d04: " + d04);
        LocalDateTime d05 = LocalDateTime.parse("2025-05-10T00:00:00");
        System.out.println("d05: " + d05);
        Instant d06 = Instant.parse("2025-05-10T00:00:00Z");
        System.out.println("d06: " + d06);
        Instant d07 = Instant.parse("2025-05-10T00:00:00-03:00");
        System.out.println("d07: " + d07);
        System.out.println();

        //TEXTO COSTUMIZADO
        System.out.println("TEXTO COSTUMIZADO");
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("d08: " + d08);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        System.out.println("d09: " + d09);
        LocalDate d10 = LocalDate.of(2022, 07, 20);
        System.out.println("d10: " + d10);
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
        System.out.println("d11: " + d11);


    }
}