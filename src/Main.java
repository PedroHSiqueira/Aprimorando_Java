import POO.Animal;
import POO.Cachorro;
import POO.Gato;

public class Main {
    public static void main(String[] args) {
//        Exemplo de herança com classes abstratas
        Cachorro cachorro1 = new Cachorro('F', 4, "Luma", 35, "Pitbull");
        Gato gato1 = new Gato('F', 2, "Becky", 7, "Frajola");

        System.out.println(cachorro1.toString());
        System.out.println(gato1.toString());
    }
}