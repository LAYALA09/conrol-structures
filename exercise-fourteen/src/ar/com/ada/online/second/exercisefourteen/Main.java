package ar.com.ada.online.second.exercisefourteen;
// Realice un proyecto, con base en una calificación proporcionada (0-10), indique con
//letra la calificación que le corresponde: 10 es “A”, 9 es “B”, 8 es “C”, 7 y 6 son “D”, y de 5
//a 0 son “F

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int qualification = 0;

        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter qualification");
        qualification = keyboard.nextInt();
        switch (qualification) {
            case 10:
                System.out.print("A");
                break;
            case 9:
                System.out.print("B");
                break;
            case 8:
                System.out.print("C");
                break;
            case 6:
                System.out.print("D");
                break;

            default:
                if(qualification >0 && qualification<5){
                System.out.print("F");
            }
        }
    }
}
