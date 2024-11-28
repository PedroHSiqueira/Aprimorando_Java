package Estruturas.Enums;

public class Enums {
    public static void main(String[] args) {
        //Seleciona apartir do Enum
        Dias primeiroDia = Dias.DOMINGO;

        System.out.println(primeiroDia);

        for(Dias meusDias: Dias.values()){
            System.out.println(meusDias);
        }
    }
}
