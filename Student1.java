/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramesh;

/**
 *
 * @author DELL
 */
import java.util.*;
public class Student1 {
        int roll_num;
    String Name;
    int phone_num;
    String address;
    void get()
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the name: ");
        Name=inp.next();
        System.out.print("Enter the roll number: ");
        roll_num=inp.nextInt();
        System.out.print
    }
    void display()
    {
        System.out.println("Roll number: "+roll_num);
        System.out.println(" Name: "+Name);  
    }
    public static void main(String args[])
    {
        Student std=new Student();
        std.get();
        std.display();
    } 
}
    
