public class calculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Soma de valores Inteiros: "+calculadora.somar(2, 5));

        System.out.println("Soma de valores com ponto Flutuante: "+calculadora.somar(2.8, 6.5));

        int[] vetor = {3, 8, 1, 6, 7, 4, 9};
        System.out.println("Soma de valores com Vetores: "+calculadora.somar(vetor));
    }
}
