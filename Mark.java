/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
abstract class Mark{
 abstract double getPercentage();
}
class A extends Mark{
 double result;
 A( int a, int b, int c){
  result=(a+b+c)/3;
 }
 double getPercentage() {
  return result;
 }
}
class B extends Mark {
 double result;
 B(int a, int b, int c, int d){
  result=(a+b+c+d)/4;
 }
 double getPercentage(){
  return result;
 }
}
class Main1{
 public static void main(String args[]){
  Mark obj_1=new A(15,30,45);
  System.out.println(obj_1.getPercentage());
  Mark obj_2=new B(18,27,38,46);
  System.out.println(obj_2.getPercentage());
 }
}
