package ExercicioSobreAnimais;
public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(String nome, String cor, String alimento, int comprimento, float velocidade, int patas) {
        super(nome, cor, "Terra", comprimento, velocidade, patas);
        this.alimento = alimento;
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Alimento: " + alimento);
    }
}