package ar.com.ada.online.second.exercisesixteen;
//El secretario de educación ha decidido otorgar un bono por desempeño a todos los
//profesores con base en la puntuación siguiente:
//Puntos Premio
//0 - 100 1 salario
//101 - 150 2 salarios mínimos
//151 - en adelante 3 salarios mínimos
//Realice un algoritmo que permita determine el monto de bono que percibirá un profesor
//(debe capturar el valor del salario mínimo y los puntos del profesor). R

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double salary;
        int points = 0;


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese puntos");
        points = keyboard.nextInt();


        System.out.print("Ingrese salario mínimo");
        salary = keyboard.nextDouble();

        if (points > 0 && points <= 100) {
            System.out.print("Le corresponde $" + salary);

        } else {
            if (points >= 101 && points <= 150) {
                System.out.print("Le corresponde $" + 2 * salary);

            } else {
                if (points >= 151) {
                    System.out.print("Le corresponde $" + 3 * salary);

                }
            }


        }
    }
}