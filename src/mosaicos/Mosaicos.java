
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
        N=n;
        cx=x;
        cy=y;
        m.CreateMatriz(n,new Point(x,y));
        
        Tile t = new Tile();
        t.Tile(n, new Point(0,0));
        
        System.out.println("\n");
        m.imprimirMatriz(n);
        launch(args);
    }
    
}
