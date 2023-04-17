
package javaapplication15;

/**
Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario,
* validando que el primer número múltiplo del segundo e imprima si el primer número 
* es múltiplo del segundo, sino informe que no lo son.

 */
public class JavaApplication15 {

    
    public static void main(String[] args) {
     
        EsMultiplo(9,3);
        
        EsMultiplo(11,3);
        
    }
    
    
    public static void EsMultiplo(int a, int b){
     
        if (a%b==0){
            System.out.println(""+a+" Es multiplo de "+b+"");
        }
        else{
            System.out.println(""+a+" No es multiplo de "+b+"");
        }
    }
}
