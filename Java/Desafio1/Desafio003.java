package Desafio1;

import java.util.Scanner;

public class Desafio003 {
    public static void main(String[] args) {
        int num, horasTrabalhadas;
        double valorHora, salario;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas*valorHora;

        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = %.2f", salario);

        sc.close();
    }
    
}