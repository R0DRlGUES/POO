package ExercicioSobreContaBancaria;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String cliente, int num_conta, float saldo, int diaRendimento) {
        super(cliente, num_conta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        int diaAtual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        if (diaAtual == diaRendimento) {
            float rendimento = saldo * taxaRendimento / 100;
            saldo += rendimento;
            System.out.println("Rendimento aplicado. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Ainda não é dia de rendimento.");
        }
    }
}
