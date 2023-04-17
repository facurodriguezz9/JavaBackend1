/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        int N=10,valor;
        boolean bandera=false;
        int [] vector = new int [N];
        
        Scanner leer = new Scanner(System.in);
        
        for(int i=0;i<N;i++){
           vector[i]=(int)(Math.random()*10+1); //formula para genera valor aleatorio.
        }
        System.out.println("El vector es: ");
          for(int i=0;i<N;i++){
              System.out.print("|"+vector[i]+"");
          }
        
        System.out.println("\nIngrese un valor a buscar: ");
        valor = leer.nextInt();
        
        for(int i=0;i<N;i++){ 
            if(valor==vector[i]){
                System.out.println("Se encontro el valor "+valor+" en la posicion "+i+"");
                bandera=true;
            }
        }
        
        if(bandera==false){
            System.out.println("No se encontró el valor "+valor+"");
        }
        
    }
    
}
