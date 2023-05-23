package com.mycompany.interfaces;

public class Animal implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Animal acelerrando");
    }

    @Override
    public void frear() {
        System.out.println("Animal freando...");
    }
}
