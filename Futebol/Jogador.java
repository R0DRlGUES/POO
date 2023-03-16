/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Futebol;

/**
 *
 * @author PEDRO
 */

    public class Jogador {

        private String nome;
        private String time;
        private String titularOuReserva;
        private double altura;
        private double peso;

        public void excluir(String nome, String time, String titularReserva, double altura, double peso) {
            this.nome = null;
            this.time = null;
            this.titularOuReserva = null;
            this.altura = 0;
            this.peso = 0;
        }

        public void edidt(String nome, String time, String titularReserva, double altura, double peso) {
            this.nome = nome;
            this.time = time;
            this.titularOuReserva = titularReserva;
            this.altura = altura;
            this.peso = peso;
        }

        public void mostraDados() {
            System.out.println("nome: " + nome);
            System.out.println("time: " + time);
            System.out.println("titularReserva: " + titularOuReserva);
            System.out.println("altura: " + altura);
            System.out.println("peso: " + peso);
            System.out.println("\n");
        }

        public void novoJogador(String nome, String time, String titularReserva, double altura, double peso) {
            this.nome = nome;
            this.time = time;
            this.titularOuReserva = titularReserva;
            this.altura = altura;
            this.peso = peso;
        }

        public String getNome() {
            return nome;
        }

    }
