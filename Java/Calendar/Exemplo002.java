package Calendar;

import java.util.Calendar;

public class Exemplo002 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        // Date data = agora.getTime();

        System.out.printf("A data de hoje é %tF\n",agora.getTime());
        
        agora.add(Calendar.DATE, 5);
        System.out.printf("A data com mais 5 dias no calendário é %tF\n",agora.getTime());
    }
}
