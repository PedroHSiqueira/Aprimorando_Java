package Estruturas.Hashmaps;

import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        //cria um hashmap de String/Integer, sendo neste caso os modelos como chave e os numeros como valores
        HashMap<String, Integer> carros = new HashMap<>();

        //adiciona a chave-valor ao hashmap
        carros.put("GT86", 86);
        carros.put("Cayman", 12);
        carros.put("GTR", 9);

        //Resultado da adição (Put)
        System.out.println(carros);

        //Somente um valor
        System.out.println(carros.get("Cayman"));

        //Remover um valor
        carros.remove("GTR");
        System.out.println(carros);

        //Ver se possui a chave
        System.out.println(carros.containsKey("GT86"));

        //Ver se possui o valor
        System.out.println(carros.containsValue(2));
    }
}
