package ar.com.ada.online.second.exercisefifteen;
//Realice un algoritmo que, con base en un número proporcionado (1-7), indique el día de
//la semana que le corresponde (L-D)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int weekdays = 0;

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Igresar dia de la semana");
        weekdays = keyboard.nextInt();
        switch (weekdays) {
            case 1:
                System.out.print("Lunes");
                break;
            case 2:
                System.out.print("Martes");
                break;
            case 3:
                System.out.print("Miércoles");
                break;
            case 4:
                System.out.print("Jueves");
                break;
            case 5:
                System.out.print("Viernes");
                break;
            case 6:
                System.out.print("Sábado");
                break;
            case 7:
                System.out.print("Domingo");
                break;

            default:

        }
    }
}


