package ar.com.ada.online.second.exercisethree;

import java.util.Scanner;

//El 14 de febrero una persona desea comprarle un regalo al ser querido que más aprecia
//en ese momento, su dilema radica en qué regalo puede hacerle, las alternativas que
//tiene son las siguientes:
//REGALO COSTO
//Tarjeta $10.00 o menos
//Chocolates $11.00 a $100.00
//Flores $101.00 a $250.00
//Anillo Más de $251.00
//Se requiere un diagrama de flujo con el algoritmo que ayude a determinar qué regalo se le
//puede comprar a ese ser tan especial por el día del amor y la amistad.
public class Main {

    public static void main(String[] args) {
        double money;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingresar monto");
        money = keyboard.nextDouble();
        if (money <= 10) {
            System.out.print("Puede comprar una tarjeta: ");
        } else {
            if (money >= 11 && money <= 100) {
                System.out.print("Puede comprar Chocolates: ");
            } else {
                if (money >= 101 && money <= 250) {

                    System.out.print("Puede comprar Flores: ");
                } else {
                    if (money >= 250) {
                        System.out.print("Puede comprar un Anillo: ");
                    }
                }
            }


        }
    }
}

