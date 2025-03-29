package br.com.javalearn.basics;

import java.time.Duration;
import java.time.LocalTime;


public class ControlFlow {

    public static String diferencaHoras(String hora1, String hora2) 
    {
        LocalTime h1 = LocalTime.parse(hora1);
        LocalTime h2 = LocalTime.parse(hora2);
        
        Duration duracao = Duration.between(h1, h2);

        long horas = duracao.toHours();
        long minutos = duracao.toMinutes() % 60;
        
        return String.format("%02d horas e %02d minutos", Math.abs(horas), Math.abs(minutos));
    }

    public static void main(String[] args) {
        
        System.out.println(diferencaHoras("06:00:00", "15:48:00")); 
        System.out.println(diferencaHoras("01:09:00", "06:00:00")); 
    }

   
}
