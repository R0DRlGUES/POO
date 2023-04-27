package ExercicioSobreAnimais;

public class testeEx4 {

    public static void main(String[] args) {
        Peixe tubarao = new Peixe("Tubarão", "Barbatanas e cauda", 300, 1.5f);

        tubarao.dados();

        Mamifero urso = new Mamifero("Urso-do-Canadá", "Castanho", "Mel", 180, 0.5f, 4);

        urso.dados();

        Mamifero camelo = new Mamifero("Camelo", "Amarelo", "Terra", 150, 2.0f, 4);

    }
}
