import java.util.Scanner; import java.util.ArrayList; class Details{
String flight; int seats;
}
interface Flights{
void getAllAvailableFlights(); void booking();
}
class Indigo implements Flights{ Scanner sc=new Scanner(System.in);
ArrayList<Details> list=new ArrayList(); int items=0;
public void getAllAvailableFlights(){ int n=1;
while(n!=0){
Details d=new Details();
System.out.println("Enter the flight and seats available:"); d.flight=sc.next();
d.seats=sc.nextInt();
 
list.add(d); items++;
System.out.print("Give 0 to end and press any number to continue:"); n=sc.nextInt();
}
}
public void booking(){ System.out.println("Flight\tSeats"); for(int i=0;i<items;i++){
System.out.println(list.get(i).flight+"\t"+list.get(i).seats);
}
System.out.print("Enter the flight name need to be booked:"); String f=sc.next();
for(int i=0;i<items;i++){ if(list.get(i).flight.equals(f)){
System.out.println("The number of seats available are "+list.get(i).seats); System.out.print("Enter number of tickets to be booked:");
int a=sc.nextInt();
System.out.println("The flight booked is "+list.get(i).flight+" and the number of seats are "+a); list.get(i).seats-=a;
break;
}
}
}
}
class Jet_Airways implements Flights{ Scanner sc=new Scanner(System.in); ArrayList<Details> list=new ArrayList(); int items=0;
public void getAllAvailableFlights(){ int n=1;
while(n!=0){
Details d=new Details();
System.out.println("Enter the flight and seats available:");
 
d.flight=sc.next(); d.seats=sc.nextInt(); list.add(d); items++;
System.out.print("Give 0 to end and press any number to continue:"); n=sc.nextInt();
}
}
public void booking(){ System.out.println("Flight\tSeats"); for(int i=0;i<items;i++){
System.out.println(list.get(i).flight+"\t"+list.get(i).seats);
}
System.out.print("Enter the flight name need to be booked:"); String f=sc.next();
for(int i=0;i<items;i++){ if(list.get(i).flight.equals(f)){
System.out.println("The number of seats available are "+list.get(i).seats); System.out.print("Enter number of tickets to be booked:");
int a=sc.nextInt();
System.out.println("The flight booked is "+list.get(i).flight+" and the number of seats are "+a); list.get(i).seats-=a;
break;
}
}
}
}
class Indian_Airways implements Flights{ Scanner sc=new Scanner(System.in); ArrayList<Details> list=new ArrayList(); int n=1,items=0;
public void getAllAvailableFlights(){ int n=1;
while(n!=0){
 
Details d=new Details();
System.out.println("Enter the flight and seats available:"); d.flight=sc.next();
d.seats=sc.nextInt(); list.add(d); items++;
System.out.print("Give 0 to end and press any number to continue:"); n=sc.nextInt();
}
}
public void booking(){ System.out.println("Flight\tSeats"); for(int i=0;i<items;i++){
System.out.println(list.get(i).flight+"\t"+list.get(i).seats);
}
System.out.print("Enter the flight name need to be booked:"); String f=sc.next();
for(int i=0;i<items;i++){ if(list.get(i).flight.equals(f)){
System.out.println("The number of seats available are "+list.get(i).seats); System.out.print("Enter number of tickets to be booked:");
int a=sc.nextInt();
System.out.println("The flight booked is "+list.get(i).flight+" and the number of seats are "+a); list.get(i).seats-=a;
break;
}
}
}
}
public class Flight {
public static void main(String[] args) { Scanner sc=new Scanner(System.in); Indigo F1=new Indigo(); Jet_Airways F2=new Jet_Airways();
 
Indian_Airways F3=new Indian_Airways(); System.out.println("Enter the available flights for Indigo:"); F1.getAllAvailableFlights();
System.out.println("Enter the available flights for Jet Airways:"); F2.getAllAvailableFlights();
System.out.println("Enter the available flights for Indian Airways:"); F3.getAllAvailableFlights();
int n=0; while(n!=4){
System.out.print("\nEnter 1 to book tickets in Indigo\nEnter 2 to book tickets in Jet Airways\nEnter 3 to book tickets in Indian Airways\nEnter 4 to end\nEnter a valid option:");
n=sc.nextInt(); switch(n){
case 1:
F1.booking(); break;
case 2:
F2.booking(); break;
case 3:
F3.booking(); break;
case 4:
break; default:
System.out.println("Enter invalid option.");
}
}
}
}
