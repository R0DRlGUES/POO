package com.mycompany.mavenproject1;

/**
 *
 * @author pedro
 */
public class animal {
    
    char sexo;
    String cor;
    String nome;
    int idade;
    double peso;
    
    public static void main(String[] args){
        
        animal Cachorro = new animal();
        Cachorro.sexo = 'F';
        Cachorro.nome = "Bombom";
        Cachorro.cor = "Preto";
        Cachorro.idade = 3;
        Cachorro.peso = 25.6;
        
        
        animal gato = new animal();
        gato.sexo = 'F';
        gato.nome = "Mya";
        gato.cor = "Branco/Preto";
        gato.idade = 4;
        gato.peso = 15.6;
        
        animal passaro = new animal();
        passaro.sexo = 'M';
        passaro.nome = "nic";
        passaro.cor = "Azul";
        passaro.idade = 2;
        passaro.peso = 0.300;
        
        
        
        
    }
    
}
