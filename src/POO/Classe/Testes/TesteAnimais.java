package POO.Classe.Testes;

import POO.Classe.Classes.Cachorro;
import POO.Classe.Classes.Gato;

public class TesteAnimais {
    public static void main(String[] args) {
//        Exemplo de herança com classes abstratas
        Cachorro cachorro1 = new Cachorro('F', 4, "Luma", 35, "Pitbull");
        Gato gato1 = new Gato('F', 2, "Becky", 7, "Frajola");

        //Realizar Sons
        cachorro1.gerarSom();
        gato1.gerarSom();

        // Carnivoros / Comer Carne
        cachorro1.comerCarne();
        gato1.comerCarne();
    }
}