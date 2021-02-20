package Date;

import java.time.LocalDate;

public class Exemplo006 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);
        LocalDate antesOntem = hoje.minusDays(2);

        System.out.println(hoje);
        System.out.println(ontem);
        System.out.println(antesOntem);
    }
}
