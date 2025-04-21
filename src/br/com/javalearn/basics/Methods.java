package br.com.javalearn.basics;

/**
 * A classe {@code Methods} fornece métodos utilitários básicos,
 * como o cálculo do fatorial de um número inteiro.
 * 
 * @author Your Name
 * @version 1.0
 * @since 2023-11-20
 */

public class Methods {

    /**
     * Calcula o fatorial de um número inteiro não negativo de forma recursiva.
     *
     * @param n o número inteiro para o qual o fatorial será calculado
     * @return o fatorial de {@code n}
     * @throws IllegalArgumentException se {@code n} for negativo
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O fatorial não é definido para números negativos.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    /**
     * Método principal que demonstra o uso do método {@code factorial}.
     *
     * @param args os argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("5! = " + result);
    }
}
