package POO.Final.Teste;

import POO.Final.Classes.Carro;

public class CarroTeste1 {
    public static void main(String[] args) {
        Carro carro = new Carro("Subaru BRZ");

        System.out.println(carro);
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
