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
public class neto extends Pessoa{
    public String nomePai;
    
    public neto(String _nome, String _cpf, Date _data, String nomePai) {
        super(_nome, _cpf, _data);
    }
    
}
