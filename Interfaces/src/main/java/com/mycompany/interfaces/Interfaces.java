package com.mycompany.interfaces;

public class Interfaces {

    /*  
    todo mundo consegue usa a belina, mesmo que nós não somos 
     herdeiros, o taline vai ser uma interface que da acesso a belina
     */


    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo animal = new Animal();
        
        carro.acelerar();
        moto.frear();
        animal.frear();

    }
  }

