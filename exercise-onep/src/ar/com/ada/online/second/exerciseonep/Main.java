package ar.com.ada.online.second.exerciseonep;

import java.util.Scanner;

//Realice un proyecto para determinar si una persona puede votar con base en su edad
//en las próximas elecciones
public class Main {

    public static void main(String[] args) {
        int age;

        System.out.print("Ingrese la edad ");
        Scanner keyboard = new Scanner(System.in);
        age = keyboard.nextInt();

        if (age > 15) {
            System.out.print("La persona puede votar ");
        }else{
            System.out.print("La persona no puede votar ");

        }
    }
}
