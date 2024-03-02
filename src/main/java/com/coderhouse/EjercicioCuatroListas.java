package com.coderhouse;

public class EjercicioCuatroListas {

    public static void main(String[] args) {

        int[] numerosEnteros = new int[5];//declarando la lista
        for (int i = 0; i < 5; i++) { //asignando valores
            numerosEnteros[i] = i;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numerosEnteros[i]);
        }

    }
}
