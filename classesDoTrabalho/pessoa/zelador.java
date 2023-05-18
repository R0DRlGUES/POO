/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

import java.util.Date;

/**
 *
 * @author PEDRO
 */
public class zelador extends funcionario {

    public String turno;
    public char setor;
    public boolean ferias;

    public zelador(String _nome, String _cpf, Date _data, double salario, Date data_admissao, String cargo, String turno, char setor, boolean ferias) {
        super(_nome, _cpf, _data, salario, data_admissao, cargo);
    }

}
