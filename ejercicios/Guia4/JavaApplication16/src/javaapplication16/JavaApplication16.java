/*Ejercicio1
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main. 

 */
package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int a,b,opc;
        
        System.out.println("Ingrese el valor de A");
        a = leer.nextInt();
        System.out.println("Ingrese el valor de B");
        b = leer.nextInt();
        
       
        
        do{
             System.out.println("MENU:\n1.Suma\n2.Resta\n3.Multiplicación\n4.Division\n0.Salir");
             opc = leer.nextInt();
            
            switch (opc){
                case 1://Suma
                        System.out.println("La Suma es: "+suma(a,b)+"");
                    break;
                case 2://Resta
                        System.out.println("La Resta es: "+resta(a,b)+"");
                    break;
                case 3://Multi
                        System.out.println("La Multiplicación es: "+multiplicacion(a,b)+""); 
                    break;
                case 4://Division
                         System.out.println("La Division es: "+division(a,b)+"");  
                    break;
                case 0:
                    System.out.println("Eligio salir");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }   
        }while(opc!=0); 
        
        
    }
    
    public static int suma(int a, int b){
        int resultado;
        
        resultado = a+b;
        
        return resultado;
    }
    
    public static int resta(int a, int b){
        int resultado;
        
        resultado = a-b;
        
        return resultado;
    }
    public static int multiplicacion(int a, int b){
        int resultado;
        
        resultado = a*b;
        
        return resultado;
    }
    
    public static float division (float a, float b){
        float resultado=0;
        
        if( b!=0){
            resultado = (float)(a/b);
        }
        else{
            System.out.println("Error, Division por cero");
        }
        
        return resultado;
    }
    
    
    
}
