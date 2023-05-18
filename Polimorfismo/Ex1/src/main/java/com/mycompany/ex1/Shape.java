/*
 *Crie uma classe abstrata "Shape" com métodos abstratos "calcularÁrea" e "calcularPerímetro". 
Implemente as subclasses "Círculo", "Retângulo" e "Triângulo" que herdam de "Shape" e implementam os métodos abstratos de forma polimórfica.
 */
package com.mycompany.ex1;

public class Shape {

    public double altura;
    public double base;

    public double calcularArea(double altura, double base) {
        double returnCalcularArea = 0;
        returnCalcularArea = altura * base;
        return returnCalcularArea;

    }

    public double calcularPerimetro(double altura, double base) {
        double returnCalcularPerimetro = 0;

        return returnCalcularPerimetro;

    }
}
