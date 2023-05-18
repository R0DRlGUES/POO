package com.mycompany.exemplopolimorfimo;

public class ExemploPolimorfimo {

    /*Muda a quantidade dos parametros, tipo dos parametro, ordem, nome ou o retorno */
    public static void main(String[] args) {
        Circulo forma = new Circulo();
        forma.desenhar(10);

        Quadrado quadro = new Quadrado();
        quadro.desenhar();

    }
}
