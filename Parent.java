/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
abstract class parent{
 abstract void message();
}
class Child_1 extends parent{
 void message() {
  System.out.println("This is first subclass");
 }
}
class Child_2 extends parent{
 void message() {
  System.out.println("This is second subclass");
 }
}
class Mains {
 public static void main(String args[])
 {
  parent obj_1=new Child_1();
  obj_1.message();
  parent obj_2=new Child_2();
  obj_2.message();
 }
}
