import java.util.*;

class Marks1

{

public static void main(String args[])

{


int  m1,m2,m3,m4,m5;

Scanner demo = new Scanner(System.in);

System.out.print("Enter the Cat 1 marks out of 30 ");
m1 = demo.nextInt();


System.out.print("Enter the Cat 2 marks out of 30");
m2 = demo.nextInt();


System.out.println("Enter the FAT marks out of 100 ");
m3 = demo.nextInt();
System.out.println("Enter the Digital Assignment 1 out of 10");
m4 = demo.nextInt();
System.out.println("Enter the Digital Assignment 2 out of 10 ");
m5 = demo.nextInt();
int private digital(int a , int b)
{
    int digitals=(a+b);
    System.out.print(digitals);
}
void private catexam(int a,int b)
{
    int cat=(a+b)/2;
    System.out.print("In Cats"+ cat);
}
void private fatexam(float a)
{
    float fat=(float) (a*0.4);
    System.out.print("Totals marks gained"+ fat);
}
catexam(m1,m2);
digital(m4,m5);
fatexam(m3);
}


}

