/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_collections2;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author eveli
 */
public class EVA3_3_COLLECTIONS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> datos = new LinkedList<String>();
        datos.add("HOLA");
        datos.add("Mundo");
        datos.add("Cruel");
        datos.add("!!");
        Comparator comparatos = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                int resu = 0;
                String cade1 = (String)o1;
                String cade2 = (String)o1;
                
                return resu;              
            }
        };
        datos.sort(comparatos);
        System.out.println(datos);


        

    }
    
}
