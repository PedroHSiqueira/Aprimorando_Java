package Estruturas.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        //Array de arrays = [[0,2], [0,3], [0,4]]
        int[][] meses = new int[12][31];
        meses[0][0] = 1;
        meses[0][1] = 2;
        meses[0][2] = 3;
        meses[0][3] = 4;

        meses[1][0] = 1;
        meses[1][1] = 2;
        meses[1][2] = 3;
        meses[1][3] = 4;

        //Irá trazer a localização do elemento em memória
        System.out.println(meses[0]);
        System.out.println(meses[1]);

        //Trara o valor guardado no local
        System.out.println(meses[0][1]);
        System.out.println(meses[1][2]);
    }
}
