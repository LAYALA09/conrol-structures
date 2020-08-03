package ar.com.ada.online.second.exercisefour;

import java.util.Scanner;

// Determinar cuánto debe cobrar por el uso del estacionamiento a sus clientes.
//Las tarifas que se tienen son las siguientes:
//a. Las dos primeras horas a $5.00 c/u.
//b. Las siguientes tres a $4.00 c/u.
//c. Las cinco siguientes a $3.00 c/u.
//d. Después de diez horas el costo por cada una es de dos pesos
public class Main {

    public static void main(String[] args) {
        double hours, amountToCollect;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("ingresar hora/s");
        hours = keyboard.nextDouble();
        if (hours >= 1 && hours <= 2) {
            amountToCollect = hours * 5;
            System.out.print("monto a cobrar: " + amountToCollect);

        } else {
            if (hours > 2 && hours <= 5) {
                amountToCollect = hours * 4;
                System.out.print("monto a cobrar: " + amountToCollect);
            } else {
                if (hours > 5 && hours <= 10) {
                    amountToCollect = hours * 3;
                    System.out.print("monto a cobrar: " + amountToCollect);
                } else {
                    amountToCollect = hours * 2;
                    System.out.print("monto a cobrar: " + amountToCollect);
                }
            }
        }

    }
}
