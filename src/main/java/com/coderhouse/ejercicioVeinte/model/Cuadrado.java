package com.coderhouse.ejercicioVeinte.model;

public class Cuadrado {

    private float lado;

    public Cuadrado(float lado){
        this.lado = lado;
    }

    public void calcularArea(){
        System.out.println("El area de un cuadrado cuyos lados miden "
        + this.lado + " es: " + this.lado * this.lado);
    }
    public float getLado() {
        return lado;
    }
}
