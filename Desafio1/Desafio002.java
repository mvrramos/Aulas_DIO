package Desafio1;

import java.util.Scanner;

public class Desafio002 {
    public static void main(String[] args) {
        int A, B, PROD;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = A * B;
        System.out.println("PROD = "+PROD);
        sc.close();
    }
}
