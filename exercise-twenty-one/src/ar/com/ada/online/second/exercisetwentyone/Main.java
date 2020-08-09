package ar.com.ada.online.second.exercisetwentyone;

import java.util.Scanner;

//El banco “Bandido de peluche” desea calcular para uno de sus clientes el saldo actual, el
//pago mínimo y el pago para no generar intereses. Los datos que se conocen son: saldo
//anterior del cliente, monto de las compras que realizó y el pago que depositó en el corteanterior. Para calcular el pago mínimo se debe considerar 15% del saldo actual, y para
//no generar intereses corresponde 85% del saldo actual, considerando que este saldo
//debe incluir 12% de los intereses causados por no realizar el pago mínimo y $200 por
//multa por el mismo motivo
public class Main {

    public static void main(String[] args) {
        double purchasesMade, paymentOfThePreviosClosing, previosBalance, interests, penalty, currentBalance, minimumPay, paymentGenerateInterest;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el valor de saldo anterior");
        previosBalance = keyboard.nextDouble();

        System.out.print("Ingrese el valor de compras realizadas");
        purchasesMade = keyboard.nextDouble();

        System.out.print("Ingrese el pago realizado en el cierre anterior");
        paymentOfThePreviosClosing = keyboard.nextDouble();

        if (previosBalance * 0.15 > paymentOfThePreviosClosing) {
            interests = previosBalance * 0.12;
            penalty = 200;
        } else {
            interests = 0;
            penalty = 0;
        }
        currentBalance = previosBalance + purchasesMade - paymentOfThePreviosClosing + interests + penalty;
        minimumPay = currentBalance * 0.15;
        paymentGenerateInterest = currentBalance * 0.85;

        System.out.print("Saldo actual; " + currentBalance);
        System.out.print("Saldo mínimo; " + minimumPay);
        System.out.print("Pago para no generar intereses; " + paymentGenerateInterest);

    }
}
