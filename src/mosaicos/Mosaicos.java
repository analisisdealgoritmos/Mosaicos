
package mosaicos;

import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static mosaicos.Matriz.matriz;

/**
 *
 * @author bryan
 */
public class Mosaicos extends Application {
    public static int N, cx,cy;
    //private static Stage window;
    //private static Scene inicio;
    public static Parent root;
    
    @Override
    public void start(Stage primaryStage) throws IOException {   
        
        root = FXMLLoader.load(getClass().getResource("MosaicoView.fxml"));
        Scene inicio = new Scene(root);
        primaryStage.setScene(inicio);
        primaryStage.show();
    }

    public static void main(String[] args) {
        int n, x, y;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Ingrese el tamaño de la matriz nxn: ");
            n = input.nextInt();
            if(n<2)
                System.out.println("n debe ser mayor a 1");
        }while(n<2);
        do{
            System.out.println("Ingrese coordenada x: ");
            x = input.nextInt();
        }while(x<0 || x >=n);
        do{
            System.out.println("Ingrese coordenada y: ");
            y = input.nextInt();
        }while(y<0 || y >=n);
        
        long inicio = System.nanoTime();
        
        
        Matriz m = new Matriz();
        N=n;
        cx=x;
        cy=y;
        Point p1 = new Point();
        p1.setPx(x);
        p1.setPy(y);
        m.CreateMatriz(n,p1);
        
        Tile t = new Tile();
        t.Tile();
        
        System.out.println("\n");
        m.imprimirMatriz(n);
        long fin = System.nanoTime();
        double dif = (double)(fin-inicio)*1.0e-9;
        System.out.println("El programa demora: "+dif + "Segundos");
        launch(args);
       
        
    }
    
}
