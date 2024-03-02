package com.coderhouse;

import java.util.Scanner;

public class EjercicioNueveListasConNombres {

    public static void main(String[] args) {
        System.out.println("Ingrese por teclado 3 nombres");

        String[] nombres = new String[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("nombre " + i + " --> ");
            nombres[i] = sc.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.print("nombre " + i + " --> ");
            System.out.println(nombres[i]);
        }
    }
}
