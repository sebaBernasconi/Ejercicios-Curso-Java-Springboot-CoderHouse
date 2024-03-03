package com.coderhouse;

import java.util.Scanner;

public class EjercicioDiecisieteAñoBiciesto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un año para ver si es biciesto");

        int año = sc.nextInt();

        if (año % 4 == 0){
            System.out.println("El año " + año + " SI es biciesto.");
        }else {
            System.out.println("El año " + año + " NO es biciesto.");

        }
    }
}
