/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        int N=10,digitos,cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
        int []vector= new int[N];
        
        for(int i=0;i<N;i++){
           vector[i]=(int)(Math.random()*100000+1); //formula para genera valor aleatorio.
        }
        
        System.out.println("El vector es: ");
          for(int i=0;i<N;i++){
              System.out.println(""+vector[i]+"");
          }
          
         for(int i=0;i<N;i++){
             digitos = (int)(Math.log10(vector[i])+1);//devuelve la cantidad de digitos del elemento [i] del vector
            
             switch(digitos){
                 case 1://numeros con 1 digito
                     cont1++;
                     break;
                 case 2://numeros con 2 digitos
                     cont2++;
                     break;
                 case 3://numeros con 3 digitos
                     cont3++;
                     break;
                 case 4://numeros con 4 digitos
                     cont4++;
                     break;
                 case 5://numeros con 5 digitos
                     cont5++;
                     break;
             }
             
         }
         
         System.out.println("La cantidad de numeros con 1 digitos es de: "+cont1+"");
         System.out.println("La cantidad de numeros con 2 digitos es de: "+cont2+"");
         System.out.println("La cantidad de numeros con 3 digitos es de: "+cont3+"");
         System.out.println("La cantidad de numeros con 4 digitos es de: "+cont4+"");
         System.out.println("La cantidad de numeros con 5 digitos es de: "+cont5+"");
         
    }
    
}
