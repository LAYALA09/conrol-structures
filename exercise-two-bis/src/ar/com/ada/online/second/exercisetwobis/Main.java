package ar.com.ada.online.second.exercisetwobis;

//determinar el sueldo semanal de un trabajador con base en
//las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada
//hora se considera como excedente y se paga el doble

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double hoursWorked;
        double hourlyPay;
        double weeklySalary;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese horas trabajadas");
        hoursWorked = keyboard.nextDouble();

        System.out.print("Ingrese pago por hora");
        hourlyPay = keyboard.nextDouble();

        if (hoursWorked > 40) {
            weeklySalary = (40 * hourlyPay) + (hoursWorked - 40) * (2 * hourlyPay);

        } else {
            weeklySalary = hoursWorked * hourlyPay;


        }
        System.out.print("El sueldo semanal es :" + weeklySalary);
    }

}