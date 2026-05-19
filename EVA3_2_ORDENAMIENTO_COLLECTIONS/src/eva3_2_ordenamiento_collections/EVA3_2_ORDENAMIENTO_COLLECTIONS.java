/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_ordenamiento_collections;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author eveli
 */
public class EVA3_2_ORDENAMIENTO_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> datos = new LinkedList<Integer>();
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        System.out.println(datos);
        Comparator comparator;
        comparator = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                int resu = 0;
                int val1, val2;
                val1 = (int)o1;
                val2=(int)o2;
                
                return val1 - val2;    
            }
        };
        datos.sort(comparator);
        System.out.println(datos);
        
        
    }
    
}
