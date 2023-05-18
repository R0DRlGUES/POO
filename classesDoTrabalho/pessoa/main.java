/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

import java.util.*;

public class main {

    public static void main(String[] args) {
        aluno i = new aluno("Jose", "132.321.654-52", new Date());
        System.out.println("Veja como os atributos doram preenchidos\n\nNome: " + i.nome);
        System.out.println("CPF: " + i.cpf);
        System.out.println("Data nascimento: " + i.data_nacimento);

        professor a = new professor("agusto", "654.987.321-44", new Date(), 5.000, "Historia");
        System.out.println("Veja como os atributos doram preenchidos\n\nNome: " + a.nome);
        System.out.println("CPF: " + a.cpf);
        System.out.println("Salario: " + a.salario);
        System.out.println("cargo: " + a.disciplina);

        funcionario b = new funcionario("arnado", "987.648.321-85", new Date(), 10.000, new Date(), "diretor");
        System.out.println("Veja como os atributos doram preenchidos\n\nNome: " + b.nome);
        System.out.println("CPF: " + b.cpf);
        System.out.println("Data nascimento: " + b.data_nacimento);
        System.out.println("Data admissao: " + b.data_admissao);
        System.out.println("Salario: " + b.salario);
        System.out.println("cargo: " + b.cargo);

        neto n = new neto("arnado", "987.648.321-85", new Date(), "cleiton");
        System.out.println("Veja como os atributos doram preenchidos\n\nNome: " + n.nome);
        System.out.println("CPF: " + n.cpf);
        System.out.println("Data nascimento: " + n.data_nacimento);
        System.out.println("Data admissao: " + n.nomePai);
        
        zelador z = new zelador("Jurandi", "123.456.234-12", new Date(), 3.000, new Date(), "zelador","Manhã",'A',false);
        System.out.println("Veja como os atributos doram preenchidos\n\nNome: " + z.nome);
        System.out.println("CPF: " + z.cpf);
        System.out.println("Data nascimento: " + z.data_nacimento);
        System.out.println("Data admissao: " + z.data_admissao);
        System.out.println("Salario: " + z.salario);
        System.out.println("cargo: " + z.cargo);
        System.out.println("turno: " + z.turno);
        System.out.println("setor: " + z.setor);
        System.out.println("ferias: " + z.ferias);

    }
}
