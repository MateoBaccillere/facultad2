package Etapa1.Condicionales;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingresa el Primer número: ");
        int number1 = scanner.nextInt();
        System.out.println("Ingresa el Segundo número: ");
        int number2 = scanner.nextInt();
        System.out.println("Ingresa el Tercer número: ");
        int number3 = scanner.nextInt();


        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("El número mayor es " + number1);
            } 
        }else if(number2 > number3){
            System.out.println("El número mayor es " + number2);
        }else{
            System.out.println("El número mayor es " + number3);
        }
        


    }
    
}
