package com.coderhouse;

public class EjercicioDieciseisNumerosYBooleanos {

    public static boolean compararNumeros(int numeroUno, int numeroDos){
        boolean sonIguales;

        if (numeroUno == numeroDos){
            sonIguales = true;
        }else {
            sonIguales = false;
        }

        return sonIguales;
    }
    public static void main(String[] args) {

        int numeroUno = 2;
        int numeroDos = 3;

        System.out.println("Los numeros " + numeroUno + " y " + numeroDos +
                " son iguales? \n" + compararNumeros(numeroUno,numeroDos));
    }
}
