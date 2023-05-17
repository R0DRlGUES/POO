package com.mycompany.ex01;

public class MAIN {
 /*
 1 - Crie uma classe abstrata chamada "FormaGeometrica" com um método abstrato "calcularArea()". 
    Em seguida, crie duas subclasses chamadas "Retangulo" e "Circulo" que herdam da classe "FormaGeometrica" e 
    implementam o método "calcularArea()" de maneiras diferentes.   
 */

    public static void main(String[] args) {
        retangulo r = new retangulo(4, 5, 3.14);

        circulo c = new circulo(4, 5, 3.14);
    }
}
