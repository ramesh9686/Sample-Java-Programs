/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
class Shapes{
    double length;
    double breadth;
    public Shapes(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void getArea(){
        double area= length*breadth;
        System.out.println("the area of the rectangle is: "+ area);
    }
    public void getPerimeter(){
        double perimeter= 2*(length*breadth);
        System.out.println("the perimeter of the rectangle is: "+ perimeter);
    }
    
}
class square extends Shapes{
        double side;
        public square(double length, double breadth,double side) {
            super(length, breadth);
            this.side= side;
        }
        public void squareArea(){
            double area= side*side;
            System.out.println("area of the square is: "+ area);
        }
        public void squarePerimeter(){
        double perimeter= 4*side;
        System.out.println("perimeter of the square is:; "+ perimeter);
    }
    }
public class Shapes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length: ");
        double length= input.nextDouble();
        System.out.println("enter the breadth: ");
        double breadth= input.nextDouble();
        System.out.println("enter the side: ");
        double hieght= input.nextDouble();
        
        square obj= new square(length, breadth, hieght);
        obj.getArea();
        obj.getPerimeter();
        obj.squareArea();
        obj.squarePerimeter();
    }
    
}

