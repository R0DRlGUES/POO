package Cerveja;

public class Cerveja {

    public String nome;
    public double valor;
    public double teorAlcolico;
    public int ml;
    private int codigo;
    private String margemLucro;
    private static int cont;

    public Cerveja() {
      

    }

    void preenchePublic(String nome, double valor, double teorAlcolico, int ml) {
        this.nome = nome;
        this.valor = valor;
        this.teorAlcolico = teorAlcolico;
        this.ml = ml;

    }

    public int setCodigo(int codigo) {

        for (int i = 0; i < 10; i++) {
            cont += 1;
        }

        return this.codigo;
    }

    public int getCodigo() {
        
        this.codigo = cont++;
        System.out.print(cont);
        return codigo;
    }

    public double getValor() {
        return this.valor;
    }

    public String getNome() {
        return this.nome;
    }

    public double getTeorAlcolico() {
        return this.teorAlcolico;
    }

    public int getMl() {
        return this.ml;
    }

    public String getMargemLucro() {
        return this.margemLucro;
    }

}
