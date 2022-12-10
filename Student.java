import java.util.Scanner; abstract class Student{
String rollno;
String name;
double subject_1_mark;
abstract void Show_student_data(); public void Get_student_data(){
Scanner sc=new Scanner(System.in); System.out.print("Enter the roll number of the student:"); rollno=sc.next();
System.out.print("Enter the name of the student:"); name=sc.next();
System.out.print("Enter the subject 1 mark of the student:"); subject_1_mark=sc.nextDouble();
}
}


interface Sport{
double sport_grace_marks=5; void Show_sport_mark();
}


interface NCC{
double NCC_grace_marks=10; void Show_NCC_mark();
 
}

class Result extends Student implements Sport,NCC{ void Show_student_data(){
System.out.println("\nThe details of the student is "); System.out.println("The roll number of the student is "+rollno); System.out.println("The name of the student is "+name); System.out.println("The subject 1 mark of the student is "+subject_1_mark);
}
public void Show_sport_mark(){
System.out.println("The sport grace mark is "+sport_grace_marks);
}
public void Show_NCC_mark(){
System.out.println("The NCC grace mark is "+NCC_grace_marks);
}
double Total_marks; double totalmarks(){
Scanner sc=new Scanner(System.in);
System.out.print("If the student has both sport and NCC grace mark type 1\nIf the student has only sport grace mark type 2\nIf the student has only NCC grace mark type 3\nIf the student doesn't have sport and NCC grace mark type 4\nEnter a valid option:");
int n=sc.nextInt(); if(n==1){
Show_sport_mark(); Show_NCC_mark();
Total_marks=subject_1_mark+sport_grace_marks+NCC_grace_marks;
}
else if(n==2){ Show_sport_mark();
Total_marks=subject_1_mark+sport_grace_marks;
}
else if(n==3){ Show_NCC_mark();
 
Total_marks=subject_1_mark+NCC_grace_marks;
}
else if(n==4){ Total_marks=subject_1_mark;
}
return Total_marks;
}
}

class Marks extends Result{ public static void main(String[] args) {
Result r=new Result();
Scanner sc=new Scanner(System.in); int n=1;
while(n!=0){ r.Get_student_data(); double x=r.totalmarks(); r.Show_student_data();
System.out.println("The total marks is "+x);  System.out.print("Enter 0 to end or press any number to continue:"); n=sc.nextInt();
}
}
}
 
