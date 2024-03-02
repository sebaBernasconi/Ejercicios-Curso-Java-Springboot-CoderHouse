package com.coderhouse;

import java.util.Scanner;

public class EjercicioDosControlDeFlujos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un nro para ver si es positivo o negativo");
        int numeroParaEvaluar = sc.nextInt();

        if (numeroParaEvaluar < 0){
            System.out.println("El numero " + numeroParaEvaluar + " es negativo.");
        }else if (numeroParaEvaluar == 0){
            System.out.println("El numero es 0");
        }else {
            System.out.println("El numero " + numeroParaEvaluar + " es positivo.");
        }
    }
}
