
public class Calculos {

    /**
     * *
     * Calcula la sumatoria de los numeros entre "x" a "y", incluyendolas
     *
     * @param x
     * @param y
     * @return sumatoria
     */
    int sumarSerie(int x, int y) {
        throw new UnsupportedOperationException("En construcción.");
    }

    /**
     * *
     * Calcula el valor absoluto de un numero
     *
     * @param num
     * @return valor absoluto
     */
    float absoluto(float num) {
        throw new UnsupportedOperationException("En construcción.");
    }

    /**
     * *
     * Cuenta las vocales en una frase
     *
     * @param texto
     * @return cantidad de vocales
     */
    int vocales(String texto) {
        if (texto == null) {
            return 0;
        }
        int contador = 0;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            if ("aeiou".indexOf(texto.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * *
     * Invierte el orden de las letras en cada palabra, pero no altera el orden
     * de las palabras
     *
     * @param texto
     * @return texto invertida
     */
    String invertir(String texto) {
        throw new UnsupportedOperationException("En construcción.");
    }

}
