/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice 
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz 
traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas
por columnas (o viceversa).
 */
package ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int [][] matA= {{0,-2,4},{2,0,2},{-4,-2,0}};
        int [][] matAT = new int [3][3];
        boolean bandera =true;
        
        
          for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matAT[i][j] = matA[j][i];
            }
          }
          
          System.out.println("La matriz A es: ");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print("|"+matA[i][j]+"");
                }
                System.out.println("");
            }
            
          System.out.println("La matriz A traspuesta es: ");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print("|"+matAT[i][j]+"");
                }
                System.out.println("");
            }
    
             for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(matA[i][j]!=(-1*matAT[i][j])){
                        bandera=false;
                    }
                }
             }  
        
            if(bandera==true){
                System.out.println("La matriz es Antisimetrica");
            }
            else{
                System.out.println("La matriz NO es Antisimetrica");
            }
        
    }
    
}
