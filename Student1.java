package Student;

public class Student1

{

 int age;

 char sex;

 String name,add,fn,mn;

public Student1(int e,char f,String a,String b,String c,String d)

 {

  age=e;

  sex=f;

  name=a;

  add=d;

  fn=b;

  mn=c;

 }




public void display()

 {

   System.out.println("STUDENT PERSONAL DETAILS");

   System.out.println("Name of the student is: "+name);

   System.out.println("Age="+age);

   System.out.println("Student is "+sex);  

   System.out.println("Address of the student is: "+add);

   System.out.println("Father's name: "+fn);

   System.out.println("Mother'sname is: "+mn);

 }

}

// class for student acedamic details(in package FIRST)



class Acedamicinfo

{

  int avg,att,rollno;

 

  public Acedamicinfo(int f,int g,int h)

  {

  

   avg=f;

   att=g;

   rollno=h;

   }

 public void display2()

 {

  

   System.out.println("STUDENT EDUCATIONAL DETAILS");

  System.out.println("Roll no of the student "+rollno);

   System.out.println("Average of Marks of student= "+avg);

   System.out.println("Attendance of student ="+att+"%");

  

   }

}

// class for faculty details(in package second)



class Teacherinfo

{

  String name,des,pos;

 

  public Teacherinfo(String n,String d,String p)

  {

  

 name=n;

des=d;

pos=p;

   }

 public void display()

 {

  

   System.out.println("STAFF  DETAILS");

  System.out.println("Name of the Member "+name);

   System.out.println("Designation= "+des);

   System.out.println("His Posistion::"+pos);

  

   }

}

// MAIN CLASS

import Student.*;





class PackageDemo

{

 public static void main(String args[])

 {

  

Student.1=new Student.Student1(18,'M',"PETER","Mr. JOHN","Mrs.MARY","VIZAG");

  a.display();

  Student.Acedamicinfo de= new Student.Acedamicinfo(499,98,1248);

   de.display2();

  Student.Teacherinfo b=new Student.Teacherinfo("DAVID","Faculty","Professor");

  b.display();

}

}

