package com.mycompany.overrride;

public class Animal {
    public void emitirSom(){
        System.out.println("o animal fex barulho");
    }
    class Cachorro extends Animal{
        @Override
        public void emitirSom(){
            System.out.println("O cachorro fezx auaua");
        }
        public class Main{
            public static void main (String [] args){
                Animal animal = new Cachorro();
                animal.emitirSom();
            }
            }
        }

    }

