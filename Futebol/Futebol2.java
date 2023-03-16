/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Futebol;

/**
 *
 * @author PEDRO
 */
public class Futebol2 extends Jogador{
   

    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Jogador j3 = new Jogador();
        Jogador j4 = new Jogador();
        Jogador j5 = new Jogador();
        
        j1.novoJogador("renan", "Corinthians", "Titular", 1.75, 66);
        j2.novoJogador("cleiton", "Corinthians", "Reserva", 1.71, 36);
        j3.novoJogador("astolfo", "Atlético", "Titular", 1.75, 26);
        j4.novoJogador("bob", "flamengo", "Titular", 1.35, 56);
        j5.novoJogador("eu", "flamengo", "Reserva", 1.68, 86);
    
        fazTime corinthians = new fazTime();
        fazTime flamengo = new fazTime();
        
        corinthians.cadastrarTime("Corinthians", j1, 0, 4, "Tite");
        flamengo.cadastrarTime("Flamengo", j3, 2, 1, "Lete");
    
        System.out.println("Proximo Jogo: " + corinthians.Time + " vs " + flamengo.Time);
        corinthians.imprimirDadosTime();
        flamengo.imprimirDadosTime();
    }
}
    

