package ar.com.ada.online.second.exerciseseven;

import java.util.Scanner;

//El presidente de la república ha decidido estimular a todos los estudiantes de una
//universidad mediante la asignación de becas mensuales, para esto se tomarán en
//consideración los siguientes criterios:
//Para alumnos mayores de 18 años con promedio mayor o igual a 9, la beca será de
//$2000.00; con promedio mayor o igual a 7.5, de $1000.00; para los promedios menores
//de 7.5 pero mayores o iguales a 6.0, de $500.00; a los demás se les enviará una carta de
//invitación incitándolos a que estudien más en el próximo ciclo escolar.
public class Main {

    public static void main(String[] args) {
        int age;
        double average = 0;
        int amountSholarShip;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese la edad del alumno");
        age= keyboard.nextInt();
        System.out.println("Ingrese promedio");
        average= keyboard.nextInt();
        if (age> 18){
            if (average >= 9) {
                amountSholarShip = 2000;
                System.out.println("El monto de la beca es: " + amountSholarShip);

            }else if(average >= 7.5 && average < 9){
                    amountSholarShip= 1800;
                System.out.println("El monto de la beca es: " + amountSholarShip);
            }else if(average < 7.5 && average >= 6) {
                amountSholarShip = 6000;
                System.out.println("El monto de la beca es: " + amountSholarShip);
            }else{
                System.out.println("Lo invitamos a estudiar ");
            }


                }else {
            if (average >= 9) {
                amountSholarShip = 3000;
                System.out.println("El monto de la beca es: " + amountSholarShip);
            } else if (average < 9 && average >= 8) {
                amountSholarShip = 2000;
                System.out.println("El monto de la beca es: " + amountSholarShip);
            } else if (average < 8 && average >= 6) {
                amountSholarShip = 100;
                System.out.println("El monto de la beca es: " + amountSholarShip);
            }else{
                System.out.println("Lo invitamos a estudiar ");
            }


            }


        }

            }



