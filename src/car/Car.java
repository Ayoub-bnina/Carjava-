/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle; 
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
   
import java.lang.Runnable ; 
/**
 *
 * @author ayoub
 */
public class Car extends Pane   {
    int x ; 
    int y; 
    Circle circle1 = new Circle(); 
    Circle circle2 = new Circle() ; 
    Polygon pol = new Polygon();
    Rectangle rect = new Rectangle(); 

    /**
     * @param args the command line arguments
     */
    public  Car (int a , int  b){
        x=a; y=b; 
        Drawcar(x, y); 
    }
    public void  setx(int a){
        x=a; 
        Drawcar(x, y); 
    }
     public void  sety(int a){
        y=a; 
        Drawcar(0, y); 
    }
    
    public void Drawcar(int a , int b ){
        x=a; y=b; 
        circle1 = new Circle(x+15,y-5,5);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        circle2 = new Circle(x+35,y-5,5);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        rect = new Rectangle(x , y-20, 50 , 10); 
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.RED);
        pol = new Polygon(x+10, y-20 , x+20 , y-30 , x+30, y-30,x+40, y-20);
        pol.setFill(Color.WHITE);
        pol.setStroke(Color.BLUE);
        getChildren().clear();
        getChildren().addAll(circle1, circle2 ,rect, pol);
    }
   /* public static void main(String[] args) {
        // TODO code application logic here
    }*/
    @Override
 public void setWidth(double width) {
 super.setWidth(width);
 Drawcar(x, y); 
 }
 public  void  movement(int a)
 { x=x+a; //y=y+15; 
if (x<800) {x=x+a;
   Drawcar(x,y);}
else if (x  >299){
    while(x!=0){
    x=x-1; Drawcar(x,y); }
}

 }
 
 @Override
 public void setHeight(double height) {
 super.setHeight(height);
Drawcar(x, y);
 }

   
}
