package com.mycompany.ex01;

public class retangulo extends formaGeometrica{

    public retangulo(double h, double l, double pi) {
        super(h, l, pi);
         this.areaRetangulo = 3 * 4;
         System.out.println("Area do retangulo é "+ areaRetangulo);
    }
}
