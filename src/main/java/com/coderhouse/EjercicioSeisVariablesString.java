package com.coderhouse;

import java.util.Scanner;

public class EjercicioSeisVariablesString {

    public static void main(String[] args) {
        System.out.println("Ingresa un string para verlo por patnalla");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        System.out.println("El nombre asignado en la variable es --> " + nombre);
    }
}
