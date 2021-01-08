package Date;

import java.time.LocalDateTime;

public class Exemplo007 {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.of(2010, 5, 15, 10, 00, 00);
        System.out.println("Calculando...\n");
        LocalDateTime futuro = data.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(futuro);
    }
}
