package com.coderhouse.ejercicioDiez.model;

public class Circulo {

    public static final float PI =3.1415926558F;
    private float radio;

    public Circulo(float radio){
        this.radio = radio;
    }
    public void calcularArea(){
        System.out.println("El area del circulo que tiene un radio " +
                this.radio + " es --> " + PI * (Math.pow(this.radio,2)));
    }
    public void calcularCircunferencia(){
        System.out.println("La circunferencia del circulo que tiene un radio " +
                this.radio + " es --> " + (2*PI) * this.radio);
    }
    public float getRadio() {
        return radio;
    }
}
