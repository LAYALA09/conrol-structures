package ar.com.ada.online.second.exerciseeleven;
//Se les dará un bono por antigüedad a los empleados de una tienda. Si tienen un año, se
//les dará $100; si tienen 2 años, $200, y así sucesivamente hasta los 5 años. Para los que
//tengan más de 5, el bono será de $1000
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int seniority =0;

        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter seniority" );
        seniority= keyboard.nextInt();
        switch(seniority) {
            case 1:
                System.out.print("El bono que le corresponde al empleado es $100");
                break;
            case 2:
                System.out.print("El bono que le corresponde al empleado es $200");
                break;
            case 3:
                System.out.print("El bono que le corresponde al empleado es $300");
                break;
            case 4:
                System.out.print("El bono que le corresponde al empleado es $400");
                break;
            case 5:
                System.out.print("El bono que le corresponde al empleado es $500");
                break;
            default:
                if (seniority > 5) {
                    System.out.print("El bono que le corresponde a este empleado es $1000");
                }
        }
    }
}
