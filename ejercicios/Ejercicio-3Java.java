
package ejercicio3java;

//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
//Nota: investigar la función toUpperCase() y toLowerCase() en Java.

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio3Java {

  
    public static void main(String[] args) {
        // TODO code application logic here
        String frase, frase2;
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        frase= leer.nextLine();
        
        frase2= toUpperCase(frase);
        
        System.out.println("En mayusculas es: "+frase2+"");
        
        System.out.println("En minusculas es: "+toLowerCase(frase)+"");
        
    }
    
}
