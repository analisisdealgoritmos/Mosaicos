/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mosaicos;

import static mosaicos.Matriz.matriz;

/**
 *
 * @author bryan
 */
public class Tile {
    public static int cont = 1;
    public void Tile(int n, Point p){
        TileRecursividad(n,p);
    }
    public Tile() {
    }
    public int TileRecursividad(int n, Point p){
        int px, py;
        px = p.getPx();
        py = p.getPy();
        
        if(n == 2){
            for(int i = 0; i< n; i++){
                for(int j = 0; j< n; j++){
                    if((matriz[px+i][py+j])==0){
                        matriz[px+i][py+j]=cont; 
                    }        
                }
            }
            cont++;
        }
        else{
            int x = px, y = py;
            for(int i=px; i<px+n; i++) {
                for(int j=py; j<py+n; j++){
                    if(matriz[i][j]!=0){
                        x=i; 
                        y=j;
                    }
                }
            }
            //Primer cuadrante
            if(x<px+n/2 && y < py+n/2){
               TileRecursividad(n/2, new Point(px,py));
                matriz[px+n/2][py+n/2-1]=cont;
                matriz[px+n/2][py+n/2]=cont;
                matriz[px+n/2-1][py+n/2]=cont;
                
                cont++;
                
                TileRecursividad(n/2, new Point(px,py+n/2));
                TileRecursividad(n/2, new Point(px+n/2,py)); 
                TileRecursividad(n/2, new Point(px+n/2,py+n/2));
            }
            //Tercer cuadrante
            else if(x<px+n/2 && y >= py+n/2){
               TileRecursividad(n/2, new Point(px,py+n/2));
                matriz[px+n/2][py+n/2-1]=cont;
                matriz[px+n/2][py+n/2]=cont;
                matriz[px+n/2-1][py+n/2]=cont;
                
                cont++;
                
                TileRecursividad(n/2, new Point(px,py));
                TileRecursividad(n/2, new Point(px+n/2,py)); 
                TileRecursividad(n/2, new Point(px+n/2,py+n/2));
            }
            //Segundo Cuadrante
            else if(x>=px+n/2 && y < py+n/2){
               TileRecursividad(n/2, new Point(px+n/2,py));
                matriz[px+n/2-1][py+n/2]=cont;
                matriz[px+n/2][py+n/2]=cont;
                matriz[px+n/2-1][py+n/2-1]=cont;
                
                cont++;
                
                TileRecursividad(n/2, new Point(px,py));
                TileRecursividad(n/2, new Point(px+n/2,py)); 
                TileRecursividad(n/2, new Point(px+n/2,py+n/2));
            }
            //Cuarto cuadrante
            else{
               TileRecursividad(n/2, new Point(px+n/2,py+n/2));
                matriz[px+n/2-1][py+n/2]=cont;
                matriz[px+n/2][py+n/2-1]=cont;
                matriz[px+n/2-1][py+n/2-1]=cont;
                
                cont++;
                
                TileRecursividad(n/2, new Point(px+n/2,py));
                TileRecursividad(n/2, new Point(px,py+n/2)); 
                TileRecursividad(n/2, new Point(px,py));
            }
        
    }
    /*
    public void insertarL(int x1,int y1,int x2, int y2, int x3, int y3) {
	cont++;
        matriz[x1][y1]=cont;
        matriz[x2][y2]=cont;
        matriz[x3][y3]=cont;
    }
*/
    return 0;
}
}
