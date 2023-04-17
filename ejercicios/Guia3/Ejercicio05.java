/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */
package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
       int limite, suma, num;
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese un valor limite positivo: ");
        limite = leer.nextInt();
        
        suma=0;
        
        while(suma<=limite){
            
             System.out.println("Ingrese un valor a sumar: ");
             num = leer.nextInt();
            
            suma+=num;//suma = suma+num;
            System.out.println("El valor de la suma es:  "+suma+"");
        }
        
    }
    
}
