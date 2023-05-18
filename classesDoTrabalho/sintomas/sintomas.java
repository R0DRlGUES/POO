/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintomas;

/**
 *
 * @author PEDRO
 */
public class sintomas {

    public boolean dorCabeça;
    public double temperatura;
    public String pressao;
    public String nomeSintoma;
    public boolean cadastrado;

    public sintomas(boolean DorCabeça, double Temperatura, String Pressao, String NomeSintoma) {
        this.dorCabeça = DorCabeça;
        this.temperatura = Temperatura;
        this.pressao = Pressao;
        this.nomeSintoma =NomeSintoma;
        this.cadastrado = true;
    }

    public String getSintomas() {
        String retorno = "Dor" + dorCabeça + " Temperatura: " + temperatura + " Doença: " + nomeSintoma;
        return retorno;
    }
    

}
