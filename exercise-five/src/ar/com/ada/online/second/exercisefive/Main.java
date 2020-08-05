package ar.com.ada.online.second.exercisefive;
//5. Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la
//persona de menor edad.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nameone= " ";
        String namedos = " ";
        String nametres= " ";
        int firstAge = 0;
        int secondAge = 0;
        int thirdAge = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese edad ");
        firstAge = keyboard.nextInt();

        System.out.println("Ingrese nombre uno");
        nameone = keyboard.nextLine();
        keyboard.nextLine();


        System.out.println("Ingrese edad 2 ");
        secondAge = keyboard.nextInt();
        System.out.println("Ingrese nombre dos");
        namedos = keyboard.nextLine();
        keyboard.nextLine();



        System.out.println("Ingrese edad 3 ");
        thirdAge = keyboard.nextInt();
        System.out.println("Ingrese nombre tres");
        nametres = keyboard.nextLine();
        keyboard.nextLine();


        if (firstAge < secondAge && firstAge < thirdAge) {

            System.out.println("La edad menor es: " + firstAge);
            System.out.println("el nombre es: " + nameone);
        }else{
            if (secondAge < firstAge && secondAge < thirdAge) {
                System.out.println("La edad menor es: " + secondAge);
                System.out.println("el nombre es: " + namedos);
            }else{
                System.out.println("La edad menor es: " + thirdAge );
                System.out.println("el nombre es: " + nametres);

            }

        }


    }
}
