package com.coderhouse.ejercicioQuince.model;

public class Triangulo {

    private float altura;
    private float base;

    public Triangulo(float altura, float base){
        this.altura = altura;
        this.base = base;
    }

    public void calcularArea(){
        System.out.println("El area del triangulo con altura " + this.altura + " y con base " +
                this.base + " es --> " + (this.base * this.altura)/2 );
    }
    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }
}
