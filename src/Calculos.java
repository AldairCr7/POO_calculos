
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
        int suma = 0;
        if (x <= y) {
            for (int i = x; i <= y; i++) {
                suma += i;
            }
        } else {
            for (int i = x; i >= y; i--) {
                suma += i;
            }
        }
        return suma;
    }

    /**
     * *
     * Calcula el valor absoluto de un numero
     *
     * @param num
     * @return valor absoluto
     */
    float absoluto(float num) {
        if (num < 0) {
            return -num;
        }
        return num;
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
        if (texto == null) {
            return null;
        }
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            resultado.append(new StringBuilder(palabra).reverse()).append(" ");
        }
        return resultado.toString().trim();
    }

}
