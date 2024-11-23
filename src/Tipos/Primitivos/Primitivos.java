package Tipos.Primitivos;

public class Primitivos {
    public static void main(String[] args) {

        //Numericos em ordem de consumo de memória
        byte numeroByte = 127;
        short numeroShort = 10;
        int numeroInt = 10;
        long numeroLong = 100000000;
        float numeroFloat = 20.0f;
        double numeroDouble = 52.0d;

        //Booleans
        boolean verdadeiro = true;
        boolean falso = true;

        //Textos
        char letraUnica = 'P';
        String nome = "Pedro"; // String não é um tipo primitivo, e sim uma classe em java

        System.out.println(numeroByte);
        System.out.println(numeroShort);
        System.out.println(numeroInt);
        System.out.println(numeroLong);
        System.out.println(numeroFloat);
        System.out.println(numeroDouble);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(letraUnica);
        System.out.println(nome);
    }
}
