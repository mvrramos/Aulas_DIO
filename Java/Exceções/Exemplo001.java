package Exceções;

public class Exemplo001 {
    try {
        new java.io.FileInputStream("arquivo.txt");
    } catch (java.io.FileInputStream e) {
        System.out.println("Não foi possível abrir arquivo para leitura");
    }

}
