package ExercicioSobreAnimais;

public class Peixe extends Animal {

    private String caracteristica;

    public Peixe(String nome, String caracteristica, int comprimento, float velocidade) {
        super(nome, "Cinza", "Mar", comprimento, velocidade, 0);
        this.caracteristica = caracteristica;
    }

    public void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Característica: " + caracteristica);
    }
}