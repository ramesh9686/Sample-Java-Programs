/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
abstract class shape{
 abstract double RectangleArea(double length, double breadth);
 abstract double SquareArea(double side);
 abstract double CircleArea(double radius);
}
class Areas extends shape{
 double RectangleArea(double length, double breadth){
  return length*breadth;
 }
 double SquareArea(double side){
  return side*side;
 }
 double CircleArea(double radius){
  return 3.14*radius*radius; 
 }
}
class main1{
 public static void main(String args[]){
  Areas obj=new Areas();
  double rect=obj.RectangleArea(20,20);
  double squr=obj.SquareArea(rect);
  double circ=obj.CircleArea(squr);
  System.out.println("Rectangle Area: "+rect);
  System.out.println("Square Area: "+squr);
  System.out.println("Circle Area: "+circ);
 }
}
