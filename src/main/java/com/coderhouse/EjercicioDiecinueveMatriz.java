package com.coderhouse;

public class EjercicioDiecinueveMatriz {

    public static void verMatriz(int[][]m){
        System.out.println("Fila | Columna | valor");
        for (int i = 0; i < m.length; i++) {
            //Recorre las filas
            for (int j = 0; j < m.length; j++) {
                //Recorre las columnas

                //como es una matriz N x N puedo usar el punto lenght
                //si no lo fuera tendria que tener dos enteros uno fila y otro columna para
                //hacer que sean la condicion de corte de los respectivos bucles
                System.out.println(i + "    |    " + j + "    |   " +m[i][j]);
            }
            System.out.println("---------------------");
        }
    }
    public static void main(String[] args) {

        int[][] m = {
                {2,3,4}
                ,{1,4,3}
                ,{4,6,8}
        };

        verMatriz(m);
        System.out.println();
        //SI NO

        int fila = 3;
        int columna = 3; //o con un System.in

        int numeroParaIncrementar = 50;
        int[][] matrizSecundaria = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matrizSecundaria[i][j] = numeroParaIncrementar;
                numeroParaIncrementar ++;
            }

        }

        verMatriz(matrizSecundaria);
    }


}
