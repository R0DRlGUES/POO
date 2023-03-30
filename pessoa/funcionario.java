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
public class funcionario extends Pessoa {

    public double salario;
    public Date data_admissao;
    public String cargo;

    public funcionario(String _nome, String _cpf, Date _data, double salario, Date data_admissao, String cargo) {
        super(_nome, _cpf, _data);
    }

}
