package Arrays;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        // Como criar um array - 1 Forma
        String[] nomes = new String[2];
        nomes[0] = "Pedro";
        nomes[1] = "Siqueira";

        for(String nome : nomes){
            System.out.println("Array de nomes: " + nome);
        }

        // 2 forma - Sem ter que definir um tamanha inicial
        ArrayList<String> carros = new ArrayList<>();
        carros.add("Toyota");
        carros.add("Nissan");
        carros.add("Subaru");

        for(String carro : carros){
            System.out.println("Array de carros: " + carro);
        }
    }
}
