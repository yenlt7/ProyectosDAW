/*
Programa que calcula el indice de masa corporal
*/
package com.mycompany.imc;

import java.util.Scanner;

/**
 *  @author Yen
 */
public class IMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        String nombre = "";
        int edad = 0;
        double peso = 0.0;
        double altura = 0.0;
        double IMC = 0.0;
        
        //Inputs y outputs
        System.out.println("FORMULARIO DE PERSONA");
        System.out.println("===================");
        System.out.println();
        System.out.println("Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Edad: ");
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Peso: ");
        peso = scanner.nextDouble();
        System.out.println("Altura: ");
        altura=scanner.nextDouble();
        IMC = peso / (altura * altura);
        System.out.println("El indice de masa corporal de " + nombre + " es " + IMC);

    }
}
