package Desafio1;

import java.util.Scanner;

public class Desafio001 {
    public static void main(String[] args) {
        int A, B, X;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();

        X = A + B;
        System.out.println("X = "+X);
        sc.close();
    }
}
