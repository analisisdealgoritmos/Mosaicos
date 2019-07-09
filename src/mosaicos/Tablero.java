
package mosaicos;

import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import static mosaicos.GenerarColores.colores;
import static mosaicos.Matriz.matriz;
import static mosaicos.Mosaicos.cx;
import static mosaicos.Mosaicos.cy;

/**
 *
 * @author bryan
 */
public class Tablero{
        
    public void Dibujar(int n, GraphicsContext gc){
        GenerarColores gcol = new GenerarColores();
        gcol.almacenarColor();
        int x;
        int y;
        int num;
        gc.setStroke(Color.BLACK);
        for(int i=0 ; i<600; i+=600/n){
            for(int j=0 ; j<600; j+=600/n){
                x=i/(600/n);
                y=j/(600/n);
                gc.strokeRect(j, i, 600/n, 600/n);
                num=matriz[x][y];
                if(num ==-1){
                    gc.setFill(Color.web(colores.get(0)));
                    gc.fillRect(j, i, 600/n, 600/n); 
                }
                else{
                    gc.setFill(Color.web(colores.get(num)));
                    gc.fillRect(j, i, 600/n, 600/n);
                }
                
            }
        }
    }
}
