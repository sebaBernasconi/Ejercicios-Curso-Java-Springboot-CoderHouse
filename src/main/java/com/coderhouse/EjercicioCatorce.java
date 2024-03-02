package com.coderhouse;

import java.util.ArrayList;
import java.util.List;

public class EjercicioCatorce {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Sebastian");
        nombres.add("Juan");
        nombres.add("Lucas");
        nombres.add("Martina");

        for (String nombre :
                nombres) {
            System.out.println("Nombre " + nombres.indexOf(nombre) +" --> "+ nombre);
        }
    }
}
