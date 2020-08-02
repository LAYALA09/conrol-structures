package ar.com.ada.online.second.exercisetwo;
// determinar si un número es positivo o negativo.
//Represéntelo en pseudocódigo y diagrama de flujo
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double number;
        String result;
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter number" );
        number= keyboard.nextDouble();
        if (number>=0 ){
            result= "POSITIVO";
        }else{
            result= "NEGATIVO";
        }
        System.out.print("The number is: " + result);
    }
}
