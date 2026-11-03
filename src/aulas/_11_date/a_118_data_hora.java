package aulas._11_date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class a_118_data_hora {
    public static void main(String[] args){
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();

        System.out.println("Gerando Uma Data");
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);

        LocalDate d4 = LocalDate.parse("2035-12-20");
        LocalDateTime d5 = LocalDateTime.parse("2026-06-30T12:30:12");
        Instant d6 = Instant.parse("2026-06-30T12:30:12Z");
        Instant d7 = Instant.parse("2026-06-30T12:30:12-03:00");

        LocalDate d8 = LocalDate.parse("20/07/2028", fmt1);

        System.out.println();
        System.out.println("Recebendo uma Data");
        System.out.println("d4: " + d4);
        System.out.println("d5: " + d5);
        System.out.println("d6: " + d6);
        System.out.println("d7: " + d7);
        System.out.println("d8: " + d8);
        System.out.println("d8: " + d8.format(fmt1)); // ou fmt1.format(d8)

        LocalDate r1 = LocalDate.ofInstant(d6, ZoneId.systemDefault());

        System.out.println();
        System.out.println(r1);

        LocalDate pastweek = r1.minusWeeks(1);

        System.out.println("Menos uma semana: " + pastweek);
        System.out.println("Menos 10 dias: " + pastweek.minus(10,ChronoUnit.DAYS));

    }
}
