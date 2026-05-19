/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_ordenamiento;

import java.util.Scanner;

/**
 *
 * @author eveli
 */
public class EVA3_4_ORDENAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] datos=new int [10];
       long ini,fin,tiempo;
       llenar(datos);
       imprimir(datos);
       System.out.println();
       System.out.println();
       selectionSort(datos);
       imprimir(datos);
       System.out.println("Numero 50 encontrado en:" + busquedaBinaria(datos,0,datos.length-1,50));
       
    
    }
    
    public static void llenar (int [] arreglo){
        
       for (int i=0; i<arreglo.length; i++){
            
           arreglo[i]= (int) (Math.random()*100);
      
       }
  }
    
    
  public static void imprimir (int [] arreglo){
        
       for (int i=0; i<arreglo.length; i++){
            
            System.out.print("["+arreglo[i]+"]");
       }       
    }
  
  
    public static void  selectionSort (int[] arreglo){
     
    for (int i=0; i<arreglo.length; i++){     
        int min=i;
        
        for (int j=i+1; j<arreglo.length; j++){
          
                if (arreglo[j]<arreglo[min]){
                min=j;
                
                }       
        }
                int temp= arreglo[min];
                arreglo[min]=arreglo[i];
                arreglo[i]=temp;
    }  
  }
    //0(nlogn) --->en un arreglo ordenado
    public static int busquedaBinaria(int[]arreglo,int ini, int fin,int valor){
      int mit=(ini+((fin-ini)/2));
        int resu=0;
        if (arreglo[mit]==valor){
           resu=mit;
        }else if(valor<arreglo[mit]&& ini!=mit){
           
              return busquedaBinaria(arreglo,ini,mit-1,valor);
              
        }else if (valor>arreglo[mit] && fin!=mit){
            
              return busquedaBinaria(arreglo,mit+1,fin,valor);
        }
         if(ini==mit && arreglo[mit]!=valor){
           
           resu=-1;
          
         }
        
        return resu;
}

   
}
