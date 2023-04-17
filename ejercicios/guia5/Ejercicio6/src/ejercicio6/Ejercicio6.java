/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        
        int [][] cuadrado = new int [3][3];
         String rta;
        do{
        int num,sumaFila1=0,sumaFila2=0,sumaFila3=0,sumaCol1=0,sumaCol2=0,sumaCol3=0,sumaDiag=0;
        
       
        
        Scanner leer  = new Scanner(System.in);
        
        System.out.println("Ingrese numeros del 1 al 9");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){    
                do{
                    num = leer.nextInt();
                    if(num<0 || num>9){
                        System.out.println("Error, deben ser numeros del 1 al 9");
                    }
                }while(num<0 || num>9);
                cuadrado[i][j]=num;
            }
        }
        
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){  
                System.out.print("|"+cuadrado[i][j]+"");
           }
             System.out.println("");
         }
        
        
        

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){ 
                if(i==0){
                    //sume la primer fila
                    sumaFila1+=cuadrado[i][j];
                }
                if(i==1){
                     //sume la 2da fila
                     sumaFila2+=cuadrado[i][j];
                }
                if(i==2){
                     //sume la 3er fila
                     sumaFila3+=cuadrado[i][j];
                }
                if(i==j){
                    //sumando diagonal principal
                    sumaDiag+=cuadrado[i][j];
                }
                if(j==0){
                     //sume la primer columna
                     sumaCol1+=cuadrado[i][j];
                }
                 if(j==1){
                     //sume la primer columna
                     sumaCol2+=cuadrado[i][j];
                }
                  if(j==2){
                     //sume la primer columna
                     sumaCol3+=cuadrado[i][j];
                }
                
            }
        }
        
        if(sumaFila1==sumaFila2&&sumaFila2==sumaFila3&&sumaFila3==sumaDiag&&sumaDiag==sumaCol1&&sumaCol2==sumaCol3){
            System.out.println(" ¡¡FELICITACIONES!! Es un cubo magico");
        }
        else{
            System.out.println("Siga participando...");
            
        }
        
            System.out.println("¿Desea seguir jugando? (s/n)");
            rta = leer.next();
        
            rta = rta.toLowerCase();
            
        }while(rta.equals("s"));
    }
    
}
