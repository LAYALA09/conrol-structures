package ar.com.ada.online.second.exerciseeighteen;
//Determinar la cantidad del bono navideño que recibirá un
//empleado de una tienda, considerando que si su antigüedad es mayor a cuatro años o
//su sueldo es menor de dos mil pesos, le corresponderá 25 % de su sueldo, y en caso
//contrario sólo le corresponderá 20 % de éste.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double salary, christmasBonus;
        int seniority;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese sueldo");
        salary = keyboard.nextDouble();

        System.out.print("Ingrese antiguedad");
        seniority = keyboard.nextInt();

        if (salary < 2000 || seniority > 4) {
            christmasBonus = salary * 0.25;

        } else {
            christmasBonus = salary * 0.20;
        }


        System.out.print("Su bono navideño es de:" + christmasBonus);

    }
}
