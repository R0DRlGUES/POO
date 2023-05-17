package com.mycompany.ex01;

public class circulo extends formaGeometrica {

    public circulo(double h, double l, double pi) {
        super(h, l, pi);
        int raio = 10;
        this.areaCirculo = pi * (raio * raio);
        System.out.println("Area do circulo é"+ areaCirculo);

    }

}
