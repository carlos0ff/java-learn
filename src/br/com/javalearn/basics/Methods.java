package br.com.javalearn.basics;

public class Methods {

    // Recursive method to compute factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("5! = " + result);
    }
}
