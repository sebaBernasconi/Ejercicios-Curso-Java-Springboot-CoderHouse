package com.coderhouse;

import java.util.Scanner;

public class EjercicioSieteControlDeFlujos {

    public static void main(String[] args) {
        System.out.println("Ingrese un nro para determinar si es par o no");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        int nroParaEvaluar = sc.nextInt();

        if (nroParaEvaluar % 2 == 0){
            System.out.println("El nro " + nroParaEvaluar + " es par");
        }else {
            System.out.println("El nro " + nroParaEvaluar + " es impar");
        }
    }
}
