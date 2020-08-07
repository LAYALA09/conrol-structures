package ar.com.ada.online.second.exerciseeight;
//Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede ser por
//su antigüedad o bien por el monto de su sueldo (el que sea mayor), de la siguiente
//forma:
//Cuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo;
//cuando es de 5 años o más, 30 %. Ahora bien, el bono por concepto de sueldo, si éste es
//menor a $1000, se da 25 % de éste, cuando éste es mayor a $1000, pero menor o igual a
//$3500, se otorga 15% de su sueldo, para más de $3500. 10%. Realice el algoritmo
//correspondiente para calcular los dos tipos de bono, asignando el mayor y represéntelo
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double seniority,salary,bonusSalay;
        double bonusSeniority=0;
        double bonusSeniority2=0;

        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter salary" );
        salary= keyboard.nextDouble();


        System.out.print("Enter seniority" );
        seniority= keyboard.nextDouble();

        if(seniority >2 && seniority< 5){
            salary= salary *0.2;
            bonusSeniority = salary;

        }else{
            if(seniority>=5){
                salary= salary *0.3;
                bonusSeniority = salary;
            }
        }

        if(salary<1000){
            salary= salary *0.25;
            bonusSeniority2 = salary;

        }else{
            if(salary >1000 && salary<= 3500){
                salary= salary *0.15;
                bonusSeniority2 = salary;


            }else{
                if(salary>3500){
                    salary= salary *0.10;
                    bonusSeniority2 = salary;
                }

            }


        }
        if (bonusSeniority > bonusSeniority2) {
            System.out.print("El bono que le corresponde es : " + bonusSeniority);
        }else{
            System.out.print("El bono que le corresponde es : " + bonusSeniority2);
        }

    }
}
