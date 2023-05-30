
package ex2;

public class MetodoBolha implements Ordenar {

    @Override
    public void ordenar(int[] vetorNumeros) {
        int chave;
        int j;
        boolean trocou = false;

        for (int i = 0; i < vetorNumeros.length; i++) {
            chave = vetorNumeros[i];
            for (j = i - 1; j >= 0 && vetorNumeros[j] > chave; j--) {
                vetorNumeros[j + 1] = vetorNumeros[j];
                trocou = true;

            }
            vetorNumeros[j + 1] = chave;
             if(!trocou) {
                 break;
             }
        }
    }
    
}
