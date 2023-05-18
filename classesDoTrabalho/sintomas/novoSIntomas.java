/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintomas;

/**
 *
 * @author PEDRO
 */
public class novoSIntomas {

    public static void main(String[] args) {
        sintomas s1 = new sintomas(true, 36.7, "3/5", "tosse");
        sintomas s2 = new sintomas(false, 36.6, "1/1", "virose");
        sintomas s3 = new sintomas(true, 37.6, "3/3", "gripe");
        sintomas s4 = new sintomas(true, 45.6, "2/23", "pneumonia");
        sintomas s5 = new sintomas(true, 23, "3/21", "hipotermia");
        sintomas s6 = new sintomas(true, 36, "12/22", "estresse");

        pessoa p1 = new pessoa();
        pessoa p6 = new pessoa();
        pessoa p5 = new pessoa();
        pessoa p4 = new pessoa();
        pessoa p3 = new pessoa();
        pessoa p2 = new pessoa();
        
        p1.setPaciente("jorge", 11, "masculino", "sus");
        p1.sintoma.getSintomas();

        p2.setPaciente("cleito", 92, "masculino", "unimed");
        p2.sintoma.getSintomas();
        
        p3.setPaciente("mariana", 62, "feminino", "unimed");
        p3.sintoma.getSintomas();

        p4.setPaciente("douglas", 51, "masculino", "unimed");
        p4.sintoma.getSintomas();

        p5.setPaciente("Renan", 21, "feminino", "sus");
        p5.sintoma.getSintomas();

        p6.setPaciente("eu", 22, "masculino", "sus");
        p6.sintoma.getSintomas();

    }

}
