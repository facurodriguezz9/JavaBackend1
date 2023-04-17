/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package javaapplication17;

import java.util.Scanner;

public class JavaApplication17 {

    public static void main(String[] args) {
       String n,rta,nombre;
       Scanner leer = new Scanner(System.in);
       
        do{
        
            datos();
            
            System.out.println("Desea agregar otra persona? (s/n)");
            rta = leer.next();
            rta =rta.toLowerCase();
            
        }while(!rta.equals("n"));
        
    }
    
    public static void datos(){
        String nombre;
        int edad;
           Scanner leer = new Scanner(System.in);
        
            System.out.println("Digite Nombre: "); 
            nombre = leer.nextLine();
            System.out.println("Digite la edad: ");
            edad = leer.nextInt();
            
            if(edad>=18){
                System.out.println(""+nombre+" Tiene "+edad+" Es mayor de edad");
            }
            else{
                 System.out.println(""+nombre+" tiene "+edad+" Es menor de edad");
            }
            
    }
    
}
