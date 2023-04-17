//Ejercicio 1: Crear un programa que dado un número determine si es par o impar.
package guia_3;

import java.util.Scanner;

public class Guia_3 {
    
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite un numero para saber si es par o impar: ");
        num = leer.nextInt();
        
        if (num%2 ==0 ){
            System.out.println("El numero ingresado es par ");
        }
        else{
            System.out.println("El numero ingresado es impar ");
        }
    }
    
}
