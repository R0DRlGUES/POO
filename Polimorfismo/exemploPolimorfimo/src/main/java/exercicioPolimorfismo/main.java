package exercicioPolimorfismo;

import java.util.*;
//pesquisa a vantagem de criar classe abstrada

public class main {

    public static void main(String[] args) {

        Veiculo[] veiculos = new Veiculo[2];

        veiculos[0] = new Carro();
        veiculos[1] = new Aviao();

        for (Veiculo veiculo : veiculos) {
            veiculo.mover();
        }

    }

}
