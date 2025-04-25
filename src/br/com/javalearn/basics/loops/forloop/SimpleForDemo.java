package br.com.javalearn.basics.loops.forloop;

public class SimpleForDemo {
    public static void main(String[] args) {
        // Loop tradicional
        for(int i = 0; i < 5; i++) {
            System.out.println("Iteração #" + i);
        }
        
        // Loop com múltiplas variáveis
        for(int i = 0, j = 10; i < j; i++, j--) {
            System.out.printf("i: %d, j: %d%n", i, j);
        }
    }
}