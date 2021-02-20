package Exceções;

public class Exemplo003 {
    //Exceções não esperadas
    
    try {
        carroVo carro = new carroVo();
        carro.getPlaca();
    } catch (IntegrationException e) {
        throw new BusinessException ("Erro na criação do objeto");
    }
}
