package ExercicioSobreEmpregados;

import ExercicioSobreIngressos.Vendedor;

public class testeEx2 {

    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", 2000.0);
        Gerente gerente = new Gerente("Maria", 5000.0, "Vendas");
        Vendedor vendedor = new Vendedor("Pedro", 1500.0, 0.1);

        System.out.println(empregado.toString());
        System.out.println(gerente.toString());
        System.out.println(vendedor.toString());
    }
}
