package br.com.javalearn.basics;



public class ControlFlow {
    public static void main(String[] args) {
        // if-else 
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C or below");
        }
        
        // switch 
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of work week");
                break;
            case "Friday":
                System.out.println("End of work week");
                break;
            default:
                System.out.println("Midweek day");
        }
        
        // for loop 
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
        
        // while loop 
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }
        
    }
}
