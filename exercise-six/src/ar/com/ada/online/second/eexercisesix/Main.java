package ar.com.ada.online.second.eexercisesix;
//6.Determinar el costo y el descuento que tendrá un artículo. Considere que si su precio es
//mayor o igual a $200 se le aplica un descuento de 15%, y si su precio es mayor a $100
//pero menor a $200, el descuento es de 12%, y si es menor a $100, sólo 10%.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double productPrice, discount, finalPrice;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        productPrice = keyboard.nextDouble();
        if (productPrice >= 200) {
            discount = productPrice * 0.15;
        } else if (productPrice >= 100) {
            discount = productPrice * 0.12;
        } else {
            discount = productPrice * 0.10;
        }
        finalPrice = productPrice - discount;

        System.out.println("El precio final del producto es de: " +finalPrice+ "con un descuento de : " +discount);
    }
}
