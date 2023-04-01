/*Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
      int numero;
      
      Scanner leer = new Scanner(System.in);
      
      System.out.println("Ingrrese un numero: ");
      numero = leer.nextInt();
      
      System.out.println("El doble de "+numero+" es: "+(2*numero)+"");
      System.out.println("El tripl de "+numero+" es: "+(3*numero)+"");
      System.out.println("La raiz cuadrada de "+Math.sqrt(numero)+"");
 
    }
    
}
