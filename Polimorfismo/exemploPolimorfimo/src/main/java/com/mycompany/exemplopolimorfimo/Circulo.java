package com.mycompany.exemplopolimorfimo;

public class Circulo extends Forma {

    public int tamanho;

    @Override
    public void desenhar() {
        System.out.println("Desehando CIRCULO");

    }

    public void desenhar(int tamanho) {
        System.out.println("Desehando CIRCULO Com tamanho :" + tamanho);

    }

}
