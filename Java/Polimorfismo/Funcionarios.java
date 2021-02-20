package Polimorfismo;

public class Funcionarios {
    public static void main(String[] args) {
        Gerente ger = new Gerente();
        System.out.println(ger.calculoImposto(5000));

        Supervisor sup = new Supervisor();
        System.out.println(sup.calculoImposto(2500));

        Atendente at = new Atendente();
        System.out.println(at.calculoImposto(1500));
    }
}
