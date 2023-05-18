/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class professor extends Pessoa {

    public double salario;
    public String disciplina;

    public professor(String _nome, String _cpf, Date _data, double salario, String disciplina) {
        super(_nome, _cpf, _data);
    }

    

}
