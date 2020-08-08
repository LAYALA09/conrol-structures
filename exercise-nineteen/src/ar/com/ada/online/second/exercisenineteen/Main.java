package ar.com.ada.online.second.exercisenineteen;
//determinar qué tipo de vacuna (A, B o C) debe aplicar a una persona,
//considerando que si es mayor de 70 años, sin importar el sexo, se le aplica la tipo C; si
//tiene entre 16 y 69 años, y es mujer, se le aplica la B, y si es hombre, la A; si es menor de
//16 años, se le aplica la tipo A, sin importar el sexo

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int age;
        String sex;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese edad");
        age = keyboard.nextInt();

        System.out.print("Ingrese sexo");
        sex = keyboard.next();

        if (age >= 70) {
            System.out.print("Debe suministrar vacuna: C");
        }
        if (age > 15 && age < 70) {
            if (sex.equals("F")) {
                System.out.print("Debe suministrar vacuna: B");
            } else {
                System.out.print("Debe suministrar vacuna: A");
            }
        }
        if (age < 16) {

            System.out.print("Debe suministrar vacuna: A");
        }


    }
}


