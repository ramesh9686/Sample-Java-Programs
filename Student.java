public class Student
{
String name,address; int roll_no;
long phone_no;
Student(String n,int r,String a,long p)
{
 
name=n; roll_no=r; address=a; phone_no=p;
}
void display()
{
System.out.println(roll_no+" "+phone_no+" "+address);
}
public static void main(String args[])
{
Student ob1=new Student("Ramesh",1,"Chennai",984752631); 
Student ob2=new Student("Sanjay",5,"Mumbai",140236958); 
ob1.display();
ob2.display();
}
}
