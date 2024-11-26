package POO.Classe.Classes;

public class Calculadora {

    //Não há um limite de quantos parametros passar
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }

        System.out.println(soma);
    }
}
