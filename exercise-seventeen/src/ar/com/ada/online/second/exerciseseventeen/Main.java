package ar.com.ada.online.second.exerciseseventeen;
//determinar qué paquete se puede comprar una persona con
//el dinero que recibirá en diciembre, considerando lo siguiente:
//a. Paquete A. Si recibe $50,000 o más se comprará una televisión, un modular, tres
//pares de zapatos, cinco camisas y cinco pantalones.
//b. Paquete B. Si recibe menos de $50,000 pero más (o igual) de $20,000, se
//comprará una grabadora, tres pares de zapatos, cinco camisas y cinco
//pantalones.
//c. Paquete C. Si recibe menos de $20,000 pero más (o igual) de $10,000, se
//comprará dos pares de zapatos, tres camisas y tres pantalones.
//d. Paquete D. Si recibe menos de $10,000, se tendrá que conformar con un par de
//zapatos, dos camisas y dos pantalones
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double amountOfMoney;
        String pack = " ";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("input amount of money: ");
        amountOfMoney = keyboard.nextDouble();


        if (amountOfMoney >= 50000) {
            pack = "Pack A";
        } else if (amountOfMoney >= 20000){
            pack = "Pack B";
       }else if ( amountOfMoney >= 10000){
            pack = "Pack C";
       }else{
        pack = "Pack D";
        }
         System.out.println("you can buy" + pack);
}
        }

