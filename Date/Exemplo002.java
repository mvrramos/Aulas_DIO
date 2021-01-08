package Date;

import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args) {
        //Mostra data segundo o computador
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        //Mostra data atual
        Date novaData = new Date();
        System.out.println(novaData);
    }
}
