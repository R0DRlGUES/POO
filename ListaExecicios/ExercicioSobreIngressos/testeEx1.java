package ExercicioSobreIngressos;

import ExercicioSobreEmpregados.Ingresso;

public class testeEx1 {
     public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50.0);
        IngressoVIP ingressoVIP = new IngressoVIP(50.0, 20.0);

        System.out.println(ingresso.toString());
        System.out.println(ingressoVIP.toString());
    }
    
}
