package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo004 {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        // String dataFormada = formatter.format(agora);
        
        System.out.println(formatter.format(agora));

    }
}
