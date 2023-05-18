/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bicicleta;

/**
 *
 * @author aluno
 */
class AdicionaBicicle {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta("Azul",26,"caloi");
        b1.setModelo("XYLR8");
        b1.setDataFabric("10/03/2001");
        
        b1.adicionaChassi(25546);
        b1.adicionaValor(1500);
        
        
        Bicicleta b2 = new Bicicleta("Ver",19,"caloi");
        b2.setModelo("222assff5");
        b2.setDataFabric("10/03/2021");
        
        b2.adicionaChassi(555445);
        b2.adicionaValor(2500);
        
        
        Bicicleta b3 = new Bicicleta("Azul",26,"oggi");
        b3.setModelo("XasdYLR8");
        b3.setDataFabric("10/03/2015");
        
        b3.adicionaChassi(99988525);
        b3.adicionaValor(25000);
        
        Bicicleta b4 = new Bicicleta("rosa",10,"caloi");
        b4.setModelo("XYLR8");
        b4.setDataFabric("10/03/2001");
        
        b4.adicionaChassi(25546);
        b4.adicionaValor(1500);
        
        
        System.out.println("|Bicicleta - Marca: "+b1.marca +" | Modelo: "+ b1.getModelo()+ " | Cor: "+ b1.cor + " | Aro: "+b1.aro +" | Valor: "+ b1.getValor() +" | Data Fabricação: "+ b1.getDataFabric()+" | Chassi: "+b1.getChassi()+"|");
        System.out.println("|Bicicleta - Marca: "+b2.marca +" | Modelo: "+ b2.getModelo()+ " | Cor: "+ b2.cor + " | Aro: "+b2.aro +" | Valor: "+ b2.getValor() +" | Data Fabricação: "+ b2.getDataFabric()+" | Chassi: "+b2.getChassi()+"|");
        System.out.println("|Bicicleta - Marca: "+b3.marca +" | Modelo: "+ b3.getModelo()+ " | Cor: "+ b3.cor + " | Aro: "+b3.aro +" | Valor: "+ b3.getValor() +" | Data Fabricação: "+ b3.getDataFabric()+" | Chassi: "+b3.getChassi()+"|");
        System.out.println("|Bicicleta - Marca: "+b4.marca +" | Modelo: "+ b4.getModelo()+ " | Cor: "+ b4.cor + " | Aro: "+b4.aro +" | Valor: "+ b4.getValor() +" | Data Fabricação: "+ b4.getDataFabric()+" | Chassi: "+b4.getChassi()+"|");


    }
    
}
