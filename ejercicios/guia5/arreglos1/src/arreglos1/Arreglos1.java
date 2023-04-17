/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos1;

/**
 *
 * @author facur
 */
public class Arreglos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] vector = {1,2,3};
        
        int [][] matriz = {{4,5,6},{7,8,9}};
        
        int sum;
        
        int []producto = new int [3];
        
        for (int i=0; i<matriz[0].length ;i++){
            sum=0;
            for (int j=0; j<vector.length-1;j++){
                sum += vector[i]*matriz [j][i];
            }
            producto[i]=sum;
        }
        
        System.out.println("Vector resultado: ");
        for (int j=0; j<producto.length;j++){
            System.out.println(""+producto[j]+"");
        }
        
    }
    
    
    
}
