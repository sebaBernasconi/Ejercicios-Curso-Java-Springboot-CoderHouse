package com.coderhouse.ejercicioCuatro.model;

public class Rectangulo {
    private float ancho;
    private float altura;

    public Rectangulo(float ancho, float largo){
        this.ancho = ancho;
        this.altura = largo;
    }

    public void calcularArea(){
        System.out.println("El area del rectuangulo con un largo de " + this.altura +
                " y un ancho de " + this.ancho + " es " + this.altura * this.ancho);
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro del rectuangulo con un largo de " + this.altura +
                " y un ancho de " + this.ancho + " es " +
                2 * (this.altura + this.ancho));
    }

    public float getAncho() {
        return ancho;
    }

    public float getAltura() {
        return altura;
    }
}