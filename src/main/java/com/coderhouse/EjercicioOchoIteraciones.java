package com.coderhouse;

public class EjercicioOchoIteraciones {

    public static void main(String[] args) {
        int numeroParaEvaluar = 1;

        System.out.println("A continuacion se van a mostrar todos los numeros que sean pares del" +
                " 1 al 20");
        while (numeroParaEvaluar <= 20){

            if (numeroParaEvaluar % 2 == 0){
                System.out.println(numeroParaEvaluar);
                numeroParaEvaluar ++;
            }else {
                numeroParaEvaluar ++;
            }
        }
    }
}
