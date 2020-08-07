package ar.com.ada.online.second.exerciseten;
//Determinar a qué lugar podrá ir de vacaciones una persona, considerando que la línea de
//autobuses “La tortuga” cobra por kilómetro recorrido. Se debe considerar el costo del
//pasaje tanto de ida, como de vuelta; los datos que se conocen y que son fijos son:
//México, 750 km; P.V., 800 km; Acapulco, 1200 km, y Cancún, 1800 km. También se debe
//considerar la posibilidad de tener que quedarse en casa.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        double budgetTrip, pricePerkm;
        String destinyOne= "México";
        String destinyTwo= "P.V.";
        String destinyThree= "Acapulco";
        String destinyFour= "Cancun";
        String destinyFive= "Casa";

        System.out.println("Ingrese el precio por km:");
        pricePerkm=keyboard.nextDouble();
        System.out.println("Ingrese el presupuesto para el viaje:");
        budgetTrip=keyboard.nextDouble();

        if( budgetTrip>=pricePerkm*1800*2) {
            System.out.println("El lugar del destino es:" +  destinyFour);
        }else{
            if( budgetTrip>=pricePerkm*1200*2) {
                System.out.println("El lugar del destino es:" + destinyTwo);
            }else{
                if( budgetTrip>=pricePerkm*800*2) {
                    System.out.println("El lugar del destino es:" + destinyThree);
                }else{
                    if( budgetTrip>=pricePerkm*750*2) {
                        System.out.println("El lugar del destino es:" + destinyFour);
                    }else{
                        System.out.println("El lugar del destino es:" + destinyFive);
                    }
                }
            }
        }
    }
}
