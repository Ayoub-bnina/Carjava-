/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;
import javafx.event.*;
import javafx.animation.*; 
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.util.Duration; 
import javafx.event.*; 
 import javafx.scene.control.Button; 
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
 

/**
 *
 * @author ayoub
 */
public class Displaycar extends Application {
    @Override // Override the start method in the Application class
 public synchronized void start(Stage primaryStage) {
     
 
 /*Car car1= new Car(-50,100); 
 Car car2= new Car(-50,100); 
 Car car3= new Car(-50,100); */
 
 

 
 HBox  spead  = new HBox();
 TextField text1 = new TextField(); 
 TextField text2 = new TextField(); 
 TextField text0 = new TextField();
 TextField text3 = new TextField(); 
 // les texfield contient les vitess de chaque car 
 text0.setText("1");
 text1.setText("1");
 text2.setText("1");
 text3.setText("1");
 //text0.setText("1");
 Label lab0 = new Label("car0"); 
 Label lab1 = new Label("car1"); 
 Label lab2 = new Label("car2"); 
 Label lab3 = new Label("car3"); 
 spead.getChildren().addAll(lab0, text0, lab1 ,text1,lab2, text2 , lab3 , text3 ); 
 HBox  pane = new HBox(8);
 HBox  pane1 = new HBox(8);
 HBox  pane2 = new HBox(8); 
 HBox  pane3 = new HBox(8);
 //HBox  pane4 = new HBox(8);
 //
 Car  car= new Car(-30, 60); 
  Car car1= new Car(-30,70);
  Car car3= new Car(-30, 140); 
 Car car2= new Car(-30, 100); 
// 
pane.getChildren().add(car); 
 pane1.getChildren().add(car1); 
 pane2.getChildren().add(car2);
pane3.getChildren().add(car3); 
 //

 GridPane racing = new GridPane();
 racing.add(pane, 0,1);
 racing.add(pane1, 0, 2);
 racing.add(pane2, 0, 3); 
  racing.add(pane3, 0,4); 
 racing.add(spead, 0, 0); 
 //
 
 pane1.setAlignment(Pos.CENTER);
 pane.setAlignment(Pos.CENTER);
 pane2.setAlignment(Pos.CENTER);
 pane3.setAlignment(Pos.CENTER);
  

 //racing.setAlignment(Pos.CENTER);
 EventHandler<ActionEvent> eventHandler = e -> {  
 int b = Integer.valueOf(text0.getText()); 
 int c = Integer.valueOf(text1.getText()); 
 int d = Integer.valueOf(text2.getText()); 
 int a = Integer.valueOf(text3.getText());
car1.movement(c); 
car3.movement(a); 
car.movement(b); 
car2.movement(d);
};
 Timeline animation = new Timeline( 
 new KeyFrame(Duration.millis(20), eventHandler)); 
 animation.setCycleCount(Timeline.INDEFINITE);
 //animation.play();

 //pane.setAlignment( Pos.CENTER);
 Scene scene = new Scene(racing, 250, 250);
  scene.setOnMousePressed(  event -> { animation.play();});
 scene.setOnMouseReleased(event -> { animation.stop();});
 primaryStage.setTitle("DisplayCar"); // Set the stage title
 primaryStage.setScene(scene); // Place the scene in the stage
 primaryStage.show();

 
 }
    public static void main(String[] args) {
        Application.launch(args);
    } 
}



