package Tipos.Casting;

public class Casting {
    public static void main(String[] args) {

        //Converte o numero de maneira forçada para caber na memória
        double numero = (double) 100.0f;

        //Irá remover Bits para que possa caber na memória, com isso o resultado será errado
        short idade = (short) 100000L;

        System.out.println(numero);
        System.out.println(idade);
    }
}
