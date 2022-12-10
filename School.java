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
class studentDetails{
    Scanner input=new Scanner(System.in);
    String name;
    int roll_no;
    public studentDetails(String name, int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }
}

class sports extends studentDetails{
    int points;
    public sports(String name, int roll_no){
        super(name,roll_no);
        
    }
    public void point(){
        System.out.print("\nIf any points obtained in sports select 1 for yes and 2 no: ");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                System.out.println("enter your points out of 10(tthis will be added to your total scores): ");
                points= input.nextInt();
                break;
            case 2:
                System.out.println("your final score will not be changed");
                points=0;
                break;
            default:
                System.out.println("valid condition was not selected");
                break;
        }  
    }
}
class marks extends sports{
    int marks[]= new int[6];
    int avg;

    public marks(String name, int roll_no) {
        super(name, roll_no);
    }
    
    public void getMarks(){
        for(int i=0;i<6;i++){
            System.out.printf("\nenter mark %d out of 50: ",i+1);
        int mark=input.nextInt();
            marks[i]=mark;
        }
    }
    public void average(){
        this.avg=avg;
        int sum=0;
        for(int j=0;j<marks.length;j++){
            sum+= marks[j];
        }
        int sum1=sum+points;
         avg= sum1/6;
         
         System.out.printf("\nmarks obtained out of 300 is %d marks + sports points is %d",sum, sum1);
        System.out.printf("\n %d's average= %d",roll_no,avg);
    }
}
class result extends marks{
    String result;
    public result(String name, int roll_no) {
        super(name, roll_no);
    }
    public void examResult(){
        if(avg>=20){
            result="pass!";
            System.out.println("\nresult: "+ result);
        }
        else if(avg<=19){
            result="fail";
            System.out.println("\nresult: "+result);
        }
    }
}
public class School {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students: ");
       int n= sc.nextInt();
       
       for(int i=0; i<n; i++){
           System.out.printf("\nenter the name and roll number of student %d: ", i+1);
     
           String name=sc.next();
           int rollno= sc.nextInt();
           result obj=new result(name,rollno);
           
           obj.point();
           obj.getMarks();
           obj.average();
           obj.examResult();
       }
    }
}

