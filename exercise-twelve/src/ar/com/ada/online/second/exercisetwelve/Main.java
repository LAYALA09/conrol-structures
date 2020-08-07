package ar.com.ada.online.second.exercisetwelve;
// determinar el sueldo semanal de un trabajador con
//base en las horas trabajadas y el pago por hora, considerando que a partir de la hora
//número 41 y hasta la 45, cada hora se le paga el doble, de la hora 46 a la 50, el triple, y
//que trabajar más de 50 horas no está permitido

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double workedHours, hourly, weeklySalary = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese horas trabajadas semanal:");
        workedHours = keyboard.nextDouble();
        System.out.println("Ingrese pago por hora:");
        hourly = keyboard.nextDouble();

        if (workedHours > 50) {
            System.out.println("No está permitido trabajar más de 50 horas");
        } else if (workedHours < 40) {
            weeklySalary = workedHours * hourly;
        } else if (workedHours < 45) {
            weeklySalary = (workedHours * hourly) * 2;
        } else {
            weeklySalary = (workedHours * hourly) * 3;
        }
        System.out.println("El salario semanal es: $ "  + weeklySalary);
    }
}



