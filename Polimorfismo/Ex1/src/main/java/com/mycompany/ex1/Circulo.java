package com.mycompany.ex1;

public class Circulo extends Shape {

    @Override
    public void calcularArea() {
        System.out.println("Calculado a Area");
    }
    @Override
    public void calcularPerimetro() {
        System.out.println("Calculado a Perimetro");
    }
}
