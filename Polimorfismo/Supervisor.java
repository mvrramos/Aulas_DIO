package Polimorfismo;

public class Supervisor extends Funcionarios{
    public double calculoImposto(int salario) {
        return salario*0.05;
    }
}
