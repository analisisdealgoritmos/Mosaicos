
package mosaicos;

import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import static mosaicos.Matriz.matriz;
import static mosaicos.Mosaicos.cx;
import static mosaicos.Mosaicos.cy;

/**
 *
 * @author bryan
 */
public class Tablero{
        
    public void Dibujar(int n, GraphicsContext gc){
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("#000000");
        colores.add("#0000FF");
        colores.add("#8A2BE2");
        colores.add("#5F9EA0");
        colores.add("#7FFF00");
        colores.add("#D2691E");
        colores.add("#6495ED");
        colores.add("#A9A9A9");
        colores.add("#BDB76B");
        colores.add("#FFD700");
        colores.add("#FF00FF");
        colores.add("#ADFF2F");
        colores.add("#CD5C5C");
        
        
        colores.add("#FFEF00");
        colores.add("#0012FF");
        colores.add("#8A24F2");
        colores.add("#5F9EA0");
        colores.add("#7AAF1A");
        colores.add("#D2DFFF");
        colores.add("#A9A89C");
        colores.add("#BCC76B");
        colores.add("#AFD70A");
        colores.add("#A2B0FF");
        colores.add("#ABBF2C");
        colores.add("#C8575D");
        
        colores.add("#BBCE81");
        colores.add("#408FF3");
        colores.add("#8ABCD4");
        colores.add("#4F9005");
        colores.add("#7BB70A");
        colores.add("#D2D89A");
        colores.add("#FF8ECA");
        colores.add("#1234DB");
        colores.add("#A158BC");
        colores.add("#BEAC89");
        colores.add("#CBAD15");
        colores.add("#FBFBF7");
        int x;
        int y;
        gc.setStroke(Color.BLACK);
        for(int i=0 ; i<600; i+=600/n){
            for(int j=0 ; j<600; j+=600/n){
                x=i/(600/n);
                y=j/(600/n);
                gc.strokeRect(i, j, 600/n, 600/n);
                if(matriz[x][y]==2){ 
                    gc.setFill(Color.web(colores.get(1)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==3){
                    gc.setFill(Color.web(colores.get(2)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==4){
                    gc.setFill(Color.web(colores.get(3)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==5){
                    gc.setFill(Color.web(colores.get(4)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==6){
                    gc.setFill(Color.web(colores.get(5)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==7){
                    gc.setFill(Color.web(colores.get(6)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==8){
                    gc.setFill(Color.web(colores.get(7)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==9){
                    gc.setFill(Color.web(colores.get(8)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==10){
                    gc.setFill(Color.web(colores.get(9)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==11){
                    gc.setFill(Color.web(colores.get(10)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==12){
                    gc.setFill(Color.web(colores.get(11)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==1){ 
                    gc.setFill(Color.web(colores.get(12)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==13){
                    gc.setFill(Color.web(colores.get(13)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==14){
                    gc.setFill(Color.web(colores.get(14)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==15){
                    gc.setFill(Color.web(colores.get(15)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==16){
                    gc.setFill(Color.web(colores.get(16)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==17){
                    gc.setFill(Color.web(colores.get(17)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==18){
                    gc.setFill(Color.web(colores.get(18)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==19){
                    gc.setFill(Color.web(colores.get(19)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==20){
                    gc.setFill(Color.web(colores.get(20)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==21){
                    gc.setFill(Color.web(colores.get(21)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==22){
                    gc.setFill(Color.web(colores.get(22)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==12){ 
                    gc.setFill(Color.web(colores.get(23)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==23){
                    gc.setFill(Color.web(colores.get(24)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==24){
                    gc.setFill(Color.web(colores.get(25)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==25){
                    gc.setFill(Color.web(colores.get(26)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==26){
                    gc.setFill(Color.web(colores.get(27)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==27){
                    gc.setFill(Color.web(colores.get(28)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==28){
                    gc.setFill(Color.web(colores.get(29)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==29){
                    gc.setFill(Color.web(colores.get(29)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==30){
                    gc.setFill(Color.web(colores.get(30)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==31){
                    gc.setFill(Color.web(colores.get(31)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==0){
                    gc.setFill(Color.web(colores.get(32)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
                else if(matriz[x][y]==-1){
                    System.out.println(x+ " "+y+" "+matriz[x][y]);
                    gc.setFill(Color.web(colores.get(0)));
                    gc.fillRect(i, j, 600/n, 600/n);
                }
            }
        }
    }
}
