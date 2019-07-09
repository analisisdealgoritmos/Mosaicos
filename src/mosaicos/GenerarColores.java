
package mosaicos;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class GenerarColores {
    public static ArrayList<String> colores;
    public String generar(){
        String[] letters = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"}; 
        String color = "#"; 
        for (int i = 0; i < 6; i++) { 
         color += letters[(int) Math.round(Math.random() * 15)]; 
        } 
        return color;
    }
    
    public void almacenarColor(){
        colores = new ArrayList<String>();
        colores.add("#000000");
        for(int i=0; i<1000000;i++){
            colores.add(generar());
        }
    }
}
