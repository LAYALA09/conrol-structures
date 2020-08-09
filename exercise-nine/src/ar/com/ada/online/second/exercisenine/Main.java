package ar.com.ada.online.second.exercisenine;
//Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y
//daños a terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A
//ambos planes se les carga 10% del costo si la persona que conduce tiene por hábito
//beber alcohol, 5% si utiliza lentes, 5% si padece alguna enfermedad –como de- ficiencia
//cardiaca o diabetes–, y si tiene más de 40 años, se le carga 20%, de lo contrario sólo
//10%. Todos estos cargos se realizan sobre el costo base. Determinar cuánto le cuesta a una persona contratar una
//póliza.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String policyType;
        double initialWage=0;
        double additional;
        double finalWage=0;
        boolean answer ;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el tipo de póliza que desea contratar, siendo A cobertura amplia y B daños a terceros");
         policyType = keyboard.next();

         switch(policyType){
             case "B":
                 initialWage=950;
                 break;
             case "A":
                 initialWage=1200;
                 break;
             default:
                 initialWage=0;
                 System.out.println("Póliza no permitida");
                 int status;
                 System.exit(  status=0);
         }
        finalWage = initialWage;

         System.out.println("Por favor, conteste las próximas preguntas con true o false");

         System.out.println("Bebe usted alcohol");
         answer = keyboard.nextBoolean();

         if (answer) {
             additional = initialWage * 0.10;
             finalWage = finalWage + additional;
         }
         System.out.println("¿Utiliza lentes");
         answer = keyboard.nextBoolean();
         if (answer){
             additional= initialWage * 0.05;
             finalWage = finalWage + additional;
         }
        System.out.println("¿Padece alguna enfermedad - como deficiencia cardíaca o diabetes");
        answer = keyboard.nextBoolean();
        if (answer) {
            additional = initialWage * 0.05;
            finalWage = finalWage + additional;
        }

        System.out.println("¿Tiene más de 40 años");
        answer = keyboard.nextBoolean();
        if (answer) {
            additional = initialWage * 0.20;
            finalWage = finalWage + additional;
        }else{
            additional = initialWage * 0.10;
            finalWage = finalWage + additional;
        }
        System.out.println("El costo de su seguro será de $" + finalWage);
    }
}
