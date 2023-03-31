/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java.ejercicio.pkg01;

import java.util.Scanner;

/**
 *
 * @author kiepsun
 */
public class IntroduccionAJavaEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
       El programa deberá después mostrar el resultado de la suma*/
       
       int num1, num2, resultado;
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el primer numero.");
       num1=leer.nextByte();
       System.out.println("Ingrese el segundo numero.");
       num2=leer.nextByte();
       resultado=num1+num2;
       System.out.println("La suma de "+num1+" mas "+num2+" es "+resultado+".");
    }
    
}
