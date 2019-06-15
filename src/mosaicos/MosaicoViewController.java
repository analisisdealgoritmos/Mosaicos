/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mosaicos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import static mosaicos.Mosaicos.N;
import static mosaicos.Mosaicos.root;

/**
 * FXML Controller class
 *
 * @author bryan
 */
public class MosaicoViewController implements Initializable {
    @FXML
    private Pane pane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Bienvenido");
    } 
     @FXML
    private Button btn;
      @FXML
    private Group group;

    @FXML
    private void graficar(ActionEvent event) {
        Group r = new Group(); 
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        //String style = "-fx-background-color: rgba(247, 243, 242, 0.5);";
       // pane.setStyle(style);
        Tablero t = new Tablero();
        t.Dibujar(N,gc);
        group.getChildren().add(canvas);
       
    }
    
}
