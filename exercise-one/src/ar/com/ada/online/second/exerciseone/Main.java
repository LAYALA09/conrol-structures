package ar.com.ada.online.second.exerciseone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int mayor;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el primer número a evaluar ");
        numberOne = keyboard.nextInt();

        System.out.print("Ingrese el segundo número a evaluar ");
        numberTwo = keyboard.nextInt();

        if (numberOne > numberTwo) {
            //valor true
            mayor = numberOne;
        } else {
            //result false
            mayor = numberTwo;

        }
        System.out.print("El número mayor es:" + mayor);
    }
}
