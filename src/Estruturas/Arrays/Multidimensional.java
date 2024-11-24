package Estruturas.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        //Array de arrays = [[0,2], [0,3], [0,4]]
        int[][] numeros = new int[2][4];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 1;
        numeros[1][1] = 2;
        numeros[1][2] = 3;
        numeros[1][3] = 4;

        //Irá trazer a localização do elemento em memória
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);

        //Trara o valor guardado no local
        System.out.println(numeros[0][1]);
        System.out.println(numeros[1][2]);

        System.out.println("\n=========================================");

        //usando o ForEach para exibir os dados
        for(int [] arrayNum : numeros){
            for (int num : arrayNum){
                System.out.println(num);
            }
        }

        System.out.println("\n=========================================");
        byte[][] arrayBytes = new byte[3][];
        byte[] bytes = {8,10,12};

        arrayBytes[0] = new byte[2];
        arrayBytes[1] = new byte[]{2,4,5,6};
        arrayBytes[2] = bytes;

        for(byte[] arrayBase : arrayBytes){
            for (byte num : arrayBase){
                System.out.println(num);
            }
        }
    }
}
