package com.coderhouse;

public class EjercicioDieciochoDelUnoAlQuince {

    public static void main(String[] args) {

        int puntoDePartida = 1;

        System.out.println("A continuacion se listaran todos los nros impares" +
                " desde el 1 hasta el 15 inclusive");
        while (puntoDePartida <= 15){
            if (puntoDePartida % 2 != 0){
                System.out.println(puntoDePartida);
                puntoDePartida ++;
            }else {
                puntoDePartida ++;
            }
        }
    }
}
