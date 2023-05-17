package com.mycompany.ex9;

public class Programador extends Funcionario {

    private String linguagem;

    public Programador(String pLinguagem, String pNome) {
        super(pNome);
        this.linguagem = pLinguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

}
