/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bicicleta;

/**
 *
 * @author aluno
 */
public class Bicicleta {

    public String cor;
    public int aro;
    public String marca;
    private String modelo;
    private String dataFabric;
    private int chassi;
    private double valor;

    public Bicicleta(String cor, int aro, String marca) {
        this.cor = cor;
        this.aro = aro;
        this.marca = marca;
        }
    
    
    public double adicionaValor(double valor) {
        this.valor = valor;
        return valor;
        }
    public int adicionaChassi(int chassi) {
        this.chassi = chassi;
        return chassi;
        }
    
    
//set
    public String setModelo(String modelo) {
        this.modelo = modelo;
        return this.modelo;
    }
    public String setDataFabric(String dataFabric) {
        this.dataFabric =dataFabric;
        return this.dataFabric;
    }
    public int setChassi(int chassi) {
        return this.chassi;
    }
    public double setValor(double valor) {
        return this.valor;
    }
//get
    public String getModelo() {
        return this.modelo;
    }
    public String getDataFabric() {
        return this.dataFabric;
    }
    public int getChassi() {
        return this.chassi;
    }
    public double getValor() {
        return this.valor;
    }
  
    
}  