package com.coderhouse;

public class EjercicioOnceOperacionesAritmeticas {

    public static void sumar(int nroUno, int nroDos){
        System.out.println("La suma de " + nroUno + " + " + nroDos +
                " es --> " + (nroUno + nroDos));
    }

    public static void restar(int nroUno, int nroDos){
        System.out.println("La resta de " + nroUno + " - " + nroDos +
                " es --> " + (nroUno - nroDos));
    }

    public static void multiplicar(int nroUno, int nroDos){
        System.out.println("La multiplicacion de " + nroUno + " * " + nroDos +
                " es --> " + (nroUno * nroDos));
    }

    public static void dividir(int nroUno, int nroDos){
        System.out.println("La division de " + nroUno + " / " + nroDos +
                " es --> " + (nroUno / nroDos));
    }
    public static void main(String[] args) {

        int numeroUno = 10;
        int numeroDos = 2;

        System.out.println("A continuacion se realizaran las operaciones aritmaticas basicas" +
                "entre el numero " + numeroUno + " y el numero " + numeroDos);

        sumar(numeroUno,numeroDos);
        System.out.println();

        restar(numeroUno,numeroDos);
        System.out.println();

        multiplicar(numeroUno,numeroDos);
        System.out.println();

        dividir(numeroUno,numeroDos);
        System.out.println();
    }
}
