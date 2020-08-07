package ar.com.ada.online.second.exercisethirteen;

import java.util.Scanner;

// Los alumnos de una escuela desean realizar un viaje de estudios, pero requieren
//determinar cuánto les costará el pasaje, considerando que las tarifas del autobús son
//las siguientes: si son más de 100 alumnos, el costo es de $20; si son entre 50 y 100,
//$35; entre 20 y 49, $40, y si son menos de 20 alumnos, $70 por cada uno. Realice el
//algoritmo para determinar el costo del pasaje de cada alumno
public class Main {

    public static void main(String[] args) {

        int students;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese cantidad de alumnos:");
        students = keyboard.nextInt();

        if (students > 100) {
            System.out.println("El costo del pasaje de cada alumno es: $20");
        } else if (students > 50 && students < 100) {
            System.out.println("El costo del pasaje de cada alumno es: $35");
        } else if (students > 20 && students < 49) {
            System.out.println("El costo del pasaje de cada alumno es: $40");
        } else if (students < 20) {
            System.out.println("El costo del pasaje de cada alumno es: $70");
        }


    }
}
