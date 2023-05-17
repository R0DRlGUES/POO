package com.mycompany.funcionario;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);

        var pedro = new Funcionario();
        System.out.println("Informe seu ano de nascimento");
        int idadePessoa = L.nextInt();
        pedro.calculaIdade(idadePessoa);
    }
}
