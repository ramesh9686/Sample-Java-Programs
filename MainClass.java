package Student;


class Personal
{

public String reg_no,name,address,email_id; public long contact_number;
public Personal(String r,String n,String a,String e,long cn)
{

reg_no=r; name=n; address=a; email_id=e;
contact_number=cn;
}
}



package Student;


class Attendance
{

public String subject;
 
public int contact_hr,attended_hr; public Attendance(String s,int ch,int ah)
{

subject=s; contact_hr=ch; attended_hr=ah;
}
}



package Student;

class Course_Instructor_Details
{

public String name; public long contact;
public Course_Instructor_Details(String s,long cn)
{

name=s; contact=cn;
}
}



package Student;
class Academic
{

public String subject; public Academic(String s)
 
{
subject=s;
}
}



package Course_Instructor;


class Personal_Details
{

public String name;
public String subjects_handling[]; public long contact;
public Personal_Details(String s,long cn,String a[])
{

name=s; contact=cn;
subjects_handling=a;
}
}



package Demo_Package;


import Student.Personal; import Student.Academic; import Student.Attendance;
import Student.Course_Instructor_Details; import Course_Instructor.Personal_Details;
 
public class MainClass
{

public static void main(String args[])
{

Personal ob=new Personal("19abc123","Mahira","23/4 San Myers,CA","Mahira123@gmail.com",1254789632);
Academic ob1=new Academic("Computer"); Attendance ob2=new Attendance("Computer",300,250);
Course_Instructor_Details ob3=new Course_Instructor_Details("Rahim",14785225);
String s[]={"Computer","DBMS","Software Architecture"}; Personal_Details ob4=new Personal_Details("Rahim",14785225,s); System.out.println("The hall ticket:-");

System.out.println(ob.name+"\n"+ob1.subject+"\n"+ob.email_id+"\n"+ob.contac t_number+"\n"+ob3.name);
if(ob2.attended_hr*100/ob2.contact_hr>=75) System.out.println("Eligible");
else
System.out.println("Ineligible");

}
}
