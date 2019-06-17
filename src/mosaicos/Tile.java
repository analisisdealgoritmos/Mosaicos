
package mosaicos;

import static mosaicos.Matriz.matriz;

/**
 *
 * @author bryan
 */
public class Tile {
    public Point pxy;
    public static int cont = 1;
    public void Tile(){
        TileRecursividad(matriz.length,new Point(0,0));
    }
    public Tile() {
    }
    public void TileRecursividad(int n, Point p){
        pxy = new Point();
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
                pxy.setPx(px);
                pxy.setPy(py);
                TileRecursividad(n/2, pxy);
                matriz[px+n/2][py+n/2-1]=cont;
                matriz[px+n/2][py+n/2]=cont;
                matriz[px+n/2-1][py+n/2]=cont;
                
                cont++;
                pxy.setPx(px);
                pxy.setPy(py+n/2);
                TileRecursividad(n/2, pxy);
                pxy.setPx(px+n/2);
                pxy.setPy(py);
                TileRecursividad(n/2, pxy); 
                pxy.setPx(px+n/2);
                pxy.setPy(py+n/2);
                TileRecursividad(n/2, pxy);
            }
            //Tercer cuadrante
            else if(x<px+n/2 && y >= py+n/2){
                pxy.setPx(px);
                pxy.setPy(py+n/2);
                TileRecursividad(n/2, new Point(px,py+n/2));
                matriz[px+n/2][py+n/2-1]=cont;
                matriz[px+n/2][py+n/2]=cont;
                matriz[px+n/2-1][py+n/2-1]=cont;
                
                cont++;
                pxy.setPx(px);
                pxy.setPy(py);
                TileRecursividad(n/2, pxy);
                pxy.setPx(px+n/2);
                pxy.setPy(py);
                TileRecursividad(n/2, pxy);
                pxy.setPx(px+n/2);
                pxy.setPy(py+n/2);
                TileRecursividad(n/2, pxy);
            }
            //Segundo Cuadrante
            else if(x>=px+n/2 && y < py+n/2){
                pxy.setPx(px+n/2);
                pxy.setPy(py);
                TileRecursividad(n/2, pxy);
                matriz[px+n/2-1][py+n/2]=cont;
                matriz[px+n/2][py+n/2]=cont;
                matriz[px+n/2-1][py+n/2-1]=cont;
                
                cont++;
                pxy.setPx(px);
                pxy.setPy(py);
                TileRecursividad(n/2, pxy);
                pxy.setPx(px);
                pxy.setPy(py+n/2);
                TileRecursividad(n/2, pxy); 
                pxy.setPx(px+n/2);
                pxy.setPy(py+n/2);
                TileRecursividad(n/2, pxy);
            }
            //Cuarto cuadrante
            else{
                pxy.setPx(px+n/2);
                pxy.setPy(py+n/2);
                TileRecursividad(n/2, pxy);
                matriz[px+n/2-1][py+n/2]=cont;
                matriz[px+n/2][py+n/2-1]=cont;
                matriz[px+n/2-1][py+n/2-1]=cont;
                
                cont++;
                pxy.setPx(px+n/2);
                pxy.setPy(py);
                TileRecursividad(n/2, pxy);
                pxy.setPx(px);
                pxy.setPy(py+n/2);
                TileRecursividad(n/2, pxy); 
                pxy.setPx(px);
                pxy.setPy(py);
                TileRecursividad(n/2, pxy);
            }
        
    }
}
}
