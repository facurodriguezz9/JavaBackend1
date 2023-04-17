/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre 
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario 
selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar
el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
caso contrario se vuelve a mostrar el menú.
 */
package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opc;
        String resp="";
        
        System.out.println("Digite dos numeros enteros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
            
        
        
        do{
            System.out.println("MENU:\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir\nElija una opcion: ");
            opc = leer.nextInt();
            
            switch(opc){
                case 1:
                    //Suma
                     System.out.println("La suma es: "+(num1+num2)+"");
                    break;
                 case 2:
                    //Resta
                      System.out.println("La resta es: "+(num1-num2)+"");
                    break; 
                 case 3:
                    //Multiplicacion
                      System.out.println("El producto es: "+(num1*num2)+"");
                    break;
                 case 4:
                    //Division
                     if(num2!=0){
                      System.out.println("La division es: "+(num1/num2)+"");
                     }
                     else{
                          System.out.println("Error, division por cero");
                     }
                    break;
                 case 5:
                    //Salir
                     System.out.println("Esta seguro que desea salir? (S/N)");
                     resp = leer.next();
                     resp = resp.toLowerCase();
                    break;
                 
                default: 
                    System.out.println("Respuesta no valida");
                     
                
            }
            
            if(resp.equals("s")){
                 System.out.println("Eligio salir");
            }
            
        }while(!resp.equals("s"));
        
        
        
    }
    
}