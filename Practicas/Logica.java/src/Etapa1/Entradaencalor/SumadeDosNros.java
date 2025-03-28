
package Etapa1.Entradaencalor;

import java.util.Scanner;

public class SumadeDosNros {

    static Scanner scanner = new Scanner(System.in);
    


    public static void main(String[] args) {

        System.out.println("Ingresa el primer número: ");
        int number1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int number2 = scanner.nextInt();


        int result = number1 + number2;

        System.out.println("El resultado de la suma entre " 
        + number1 + " y " + number2 + " es " + result);
    }
     
}
