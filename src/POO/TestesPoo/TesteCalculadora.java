package POO.TestesPoo;

import POO.Classes.Calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //Quanto parametros quiser por conta do varArgs
        calculadora.somaVarArgs(1,2,3,4,5);
        calculadora.somaVarArgs(1,2,3);
    }
}
