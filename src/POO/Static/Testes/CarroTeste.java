package POO.Static.Testes;

import POO.Static.Classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Porsche", 280);
        Carro carro2 = new Carro("BMW", 275);
        Carro carro3 = new Carro("Mercedes", 270);

        Carro.setVelocidadeLimite(180);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
