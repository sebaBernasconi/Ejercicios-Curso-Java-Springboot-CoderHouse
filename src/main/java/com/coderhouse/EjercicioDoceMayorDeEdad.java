package com.coderhouse;

import java.util.Scanner;

public class EjercicioDoceMayorDeEdad {

    public static void main(String[] args) {
        System.out.println("Ingrese su edad para ver si es mayor");

        Scanner sc = new Scanner(System.in);

        int edad = sc.nextInt();

        if (edad >= 18){
            System.out.println("es mayor de edad ya que tiene " + edad + " años");
        }else {
            System.out.println("es menor de edad ya que tiene " + edad + " años");

        }
    }
}
