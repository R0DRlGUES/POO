package com.mycompany.ex2;

public class contaBancaria {
/*
 2 - Crie uma classe chamada "ContaBancaria" com atributos privados, como "saldo" e "titular".
    Utilize encapsulamento para permitir o acesso a esses atributos por meio de métodos getters e setters.   
 */
    private double saldo;
    private String titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
