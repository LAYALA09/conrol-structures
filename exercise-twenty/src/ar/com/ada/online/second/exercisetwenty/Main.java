package ar.com.ada.online.second.exercisetwenty;
//Realice un algoritmo para resolver el siguiente problema: una fábrica de pantalones
//desea calcular cuál es el precio final de venta y cuánto ganará por los N pantalones que
//produzca con el corte de alguno de sus modelos, para esto se cuenta con la siguiente
//información:
//a. Tiene dos modelos A y B, tallas 30, 32 y 36 para ambos modelos.
//b. Para el modelo A se utiliza 1.50 m de tela, y para el B 1.80 m.
//c. Al modelo A se le carga 80 % del costo de la tela, por mano de obra. Al modelo B
//se le carga 95 % del costo de la tela, por el mismo concepto.
//d. A las tallas 32 y 36 se les carga 4 % del costo generado por mano de obra y tela,
//sin importar el modelo.
//e. Cuando se realiza el corte para fabricar una prenda sólo se hace de un solo
//modelo y una sola talla.
//f. Finalmente, a la suma de estos costos se les carga 30%, que representa la
//ganancia extra de la tienda.


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int pantsModel;
        String model;
        int size;
        double price, quantityA, quantityB, finalCost, gain;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese modelo");
        model = keyboard.nextLine();

        System.out.println("Ingrese talle");
        size = keyboard.nextInt();

        System.out.println("Ingrese cantidad de pantalones");
        pantsModel = keyboard.nextInt();


        System.out.println("Ingrese precio");
        price = keyboard.nextDouble();


        if (model.equalsIgnoreCase("A")) {
            switch (size) {
                case 30:
                    quantityA = price * 1.8;
                    finalCost = quantityA * 1.3;
                    gain = pantsModel * quantityA * 0.3;
                    System.out.println("El costo final es: " + finalCost);
                    System.out.println("La ganancia es: " + gain);
                    break;
                case 32:
                    quantityA = (price * 0.8) + (price * 1.04);
                    finalCost = quantityA * 1.3;
                    gain = pantsModel * quantityA * 0.3;
                    System.out.println("El costo final es: " + finalCost);
                    System.out.println("La ganancia es: " + gain);
                    break;
                case 36:
                    quantityA = (price * 0.8) + (price * 1.04);
                    finalCost = quantityA * 1.3;
                    gain = pantsModel * quantityA * 0.3;
                    System.out.println("El costo final es: " + finalCost);
                    System.out.println("La ganancia es: " + gain);

                default:
                    System.out.println("El talle no existe");

            }

        } else {
            switch (size) {
                case 30:
                    quantityB = price * 1.95;
                    finalCost = quantityB * 1.3;
                    gain = pantsModel * quantityB * 0.3;
                    System.out.println("El costo final es: " + finalCost);
                    System.out.println("La ganancia es: " + gain);
                    break;
                case 32:
                    quantityB = (price * 0.95) + (price * 1.04);
                    finalCost = quantityB * 1.3;
                    gain = pantsModel * quantityB * 0.3;
                    System.out.println("El costo final es: " + finalCost);
                    System.out.println("La ganancia es: " + gain);
                    break;
                case 36:
                    quantityB = (price * 0.95) + (price * 1.04);
                    finalCost = quantityB * 1.3;
                    gain = pantsModel * quantityB * 0.3;
                    System.out.println("El costo final es: " + finalCost);
                    System.out.println("La ganancia es: " + gain);

                default:
                    System.out.println("El talle no existe");


            }


        }


    }
}

