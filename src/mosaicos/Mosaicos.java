
package mosaicos;

import java.util.Scanner;
import static mosaicos.Matriz.matriz;

/**
 *
 * @author bryan
 */
public class Mosaicos {

    public static void main(String[] args) {
        int n, x, y;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Ingrese el tamaño de la matriz nxn: ");
            n = input.nextInt();
            if(n%2==1)
                System.out.println("n debe ser par");
        }while(n%2!=0);
        do{
            System.out.println("Ingrese coordenada x: ");
            x = input.nextInt();
        }while(x<0 || x >=n);
        do{
            System.out.println("Ingrese coordenada y: ");
            y = input.nextInt();
        }while(y<0 || y >=n);
        
        
        
        Matriz m = new Matriz();
        m.CreateMatriz(n,new Point(x,y));
        
        Tile t = new Tile();
        t.Tile(n, new Point(0,0));
        
        System.out.println("\n");
        m.imprimirMatriz(n);
    }
    
}
