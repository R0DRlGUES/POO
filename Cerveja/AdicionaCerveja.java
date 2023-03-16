/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cerveja;

public class AdicionaCerveja {

    public static void main(String[] args) {
        Cerveja c1 = new Cerveja();
        c1.preenchePublic("Skol", 4.5, 5, 330);

        Cerveja c2 = new Cerveja();
        c2.preenchePublic("Brahma", 5.5, 5, 300);

        Cerveja c3 = new Cerveja();
        c3.preenchePublic("Amesltel", 4.5, 12, 330);

        Cerveja c4 = new Cerveja();
        c4.preenchePublic("Sub Zero", 5.22, 13, 300);

        Cerveja c5 = new Cerveja();
        c5.preenchePublic("Antartica", 6.60, 5, 330);

        System.out.println("Nome: " + c1.nome + " Valor: " + c1.valor + " Teor alcolico: " + c1.teorAlcolico + " Ml: " + c1.ml + " Código: " + c1.getCodigo());
        System.out.println("Nome: " + c2.nome + " Valor: " + c2.valor + " Teor alcolico: " + c2.teorAlcolico + " Ml: " + c2.ml + " Código: " + c2.getCodigo());
        System.out.println("Nome: " + c3.nome + " Valor: " + c3.valor + " Teor alcolico: " + c3.teorAlcolico + " Ml: " + c3.ml + " Código: " + c3.getCodigo());
        System.out.println("Nome: " + c4.nome + " Valor: " + c4.valor + " Teor alcolico: " + c4.teorAlcolico + " Ml: " + c4.ml + " Código: " + c4.getCodigo());

    }

}
