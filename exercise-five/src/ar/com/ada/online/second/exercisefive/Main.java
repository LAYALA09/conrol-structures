package ar.com.ada.online.second.exercisefive;
 //Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la
//persona de menor edad.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstName;
        String secondName;
        String thirdName;
        int firstAge = 0;
        int secondAge = 0;
        int thirdAge = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre ");
        firstName = keyboard.next();


        System.out.println(" Ingrese primer edad ");
        firstAge = keyboard.nextInt();

        System.out.println(" Ingrese el segundo nombre");
        secondName = keyboard.next();



        System.out.println(" Ingrese segunda edad ");
        secondAge = keyboard.nextInt();

        System.out.println(" Ingrese tercer nombre ");
        thirdName = keyboard.next();


        System.out.println(" Ingrese tercera edad");
        thirdAge = keyboard.nextInt();


        if (firstAge < secondAge && firstAge < thirdAge) {

            System.out.println(" La edad menor es: " + firstAge + " y el nombre es " + firstName);


        } else  if (secondAge < firstAge && secondAge < thirdAge) {
                System.out.println(" La edad menor es: " + secondAge + " y el nombre es " + secondName);


            } else {
                System.out.println(" La edad menor es: " + thirdAge + " y el nombre es " + thirdName);


            }

        }


    }

