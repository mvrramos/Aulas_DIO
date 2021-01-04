import java.util.Scanner;

public class ExCarro {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int pessoas, lugares;

        System.out.println("Quantas pessoas estão no carro? (Contando com o motorista)");
        pessoas = sc.nextInt();
        System.out.println("Há quantos lugares no carro?");
        lugares = sc.nextInt();

        if (pessoas > lugares) {
            System.out.println("O carro está com " + (pessoas-5) +" pessoa(s) a mais");

            while (pessoas > lugares) {
                pessoas--;
            }
            System.out.printf("Agora temos %d passageitos", pessoas);
        }if (pessoas < lugares) {
            System.out.println("Ainda há espaço para mais pessoas no carro");
            while (pessoas < lugares) {
                pessoas++;
            }
            System.out.printf("Agora temos %d pessoas", pessoas);
        }else{
            System.out.println("O carro está com ocupação maxima");
        }
        sc.close();
    }
}
