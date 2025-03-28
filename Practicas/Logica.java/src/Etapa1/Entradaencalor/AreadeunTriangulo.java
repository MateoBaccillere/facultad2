package Etapa1.Entradaencalor;

import java.util.Scanner;

public class AreadeunTriangulo {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Inserta el valor de la base del Triángulo: ");
        float base = scanner.nextFloat();
        System.out.println("Inserta la altura del Triángulo: ");
        float altura =  scanner.nextFloat();


        float areaTriangulo = (base * altura)/2;

        System.out.println("El área del Triángulo es : " + areaTriangulo);
        
    }
    
}
