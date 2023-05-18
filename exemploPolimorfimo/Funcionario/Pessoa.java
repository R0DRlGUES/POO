package com.mycompany.funcionario;

import java.util.*;

public class Pessoa {

    public int anoNasc;
    public int idade;

    public int calculaIdade(int anoNasc) {
        this.anoNasc = anoNasc;
        int returnIdade = 2023 - this.anoNasc;
        System.out.println("Sua idade é "+returnIdade);
        return returnIdade;
    }
}
