/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Futebol;

/**
 *
 * @author PEDRO
 */

    public class fazTime {
    public String Time;
    public Jogador jogador;
    public int vitoria;
    public int derrota;
    public String tecnico;
    
    public void cadastrarTime(String nome, Jogador jogador, int vitoria, int derrota, String tecnico) {
        this.Time = nome;
        this.jogador = jogador;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.tecnico = tecnico;
    }
    public void imprimirDadosTime(){
    System.out.println("Nome do Time: " + Time);
    System.out.println("Jogador: " + jogador.getNome());
    System.out.println("Vitorias: " + vitoria);
    System.out.println("Derrotas: " + derrota);
    System.out.println("Tecnico: " + tecnico);
    System.out.println("\n");
}
    
}
