/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramesh;
import java.util.*;
public class Grocery
{
private int item_code,quantity; private String name;
private double rate; void setItem(int i)
 
{
item_code=i;
}
void setQuantity(int q)
{
quantity+=q;
}
void setName(String n)
{
name=n;
}
void setRate(double r)
{
rate=r;
}
int getItem(){return item_code;} int getQuantity(){return quantity;} String getName(){return name;} double getRate(){return rate;}
}
class GroceryAccess
{
double amt;
ArrayList <String> item; ArrayList <Grocery> ar; GroceryAccess()
{
item=new ArrayList<>(2); ar= new ArrayList<>(2);
 
amt=0.0d;
}
int checkItem(int n)
{
for(int i=0;i<ar.size();i++)
{
if(n==ar.get(i).getItem()) return i;
}
return -1;
}
void add()
{
System.out.println("Enter Item code: "); int i=new Scanner(System.in).nextInt(); int indx=checkItem(i);
if(indx!=-1)
{
System.out.println("The given code already exists.\nEnter new quantity."); ar.get(indx).setQuantity(new Scanner(System.in).nextInt());
display(); return;
}
System.out.println("Enter name, rate and quantity:-"); Grocery ob=new Grocery();
ob.setItem(i);
ob.setName(new Scanner(System.in).nextLine()); ob.setRate(new Scanner(System.in).nextDouble()); ob.setQuantity(new Scanner(System.in).nextInt()); ar.add(ob);
display();
}
void display()
{
 
System.out.println("List of items:-"); for(int i=0;i<ar.size();i++)
{
System.out.println(ar.get(i).getItem()+" "+ar.get(i).getName()+" "+ar.get(i).getRate()+" "+ar.get(i).getQuantity());
}
}
void buy_sell()
{
System.out.println("Press 1 to purchase item.\nPress 2 to add item."); int ch1=0,ch2=0;
ch2=new Scanner(System.in).nextInt(); do{
if(ch2==1)
{
System.out.println("Enter item code: "); int i=new Scanner(System.in).nextInt(); int indx=checkItem(i);
if(indx==-1 || ar.get(indx).getQuantity()==0) System.out.println("Sorry, Item unavailable.");
else
{
System.out.println("Enter quantity of purchase: ");int q=new Scanner(System.in).nextInt(); if(q>ar.get(indx).getQuantity())
{
System.out.println("Sorry exceeding in-stock limit.");
}
else
{
item.add(ar.get(indx).getName()); System.out.println("Item added to cart successfully."); amt=amt+(q*ar.get(indx).getRate()); ar.get(indx).setQuantity((q*-1));
display();
 
}
}
System.out.println("Want to buy anything else?\nPress 1 for yes and 2 for no."); ch1=new Scanner(System.in).nextInt();
}
}while(ch1==1); if(ch2==2)
{
System.out.println("Enter item code: "); int i=new Scanner(System.in).nextInt(); int indx=checkItem(i);
if(indx==-1 || ar.get(indx).getQuantity()==0) System.out.println("Sorry, Item unavailable.");
else
{
System.out.println("Enter the quantity: "); ar.get(indx).setQuantity(new Scanner(System.in).nextInt()); display();
}
}
}
void details()
{
System.out.println("Enter item code: "); int i=new Scanner(System.in).nextInt(); int indx=checkItem(i);
if(indx==-1 || ar.get(indx).getQuantity()==0) System.out.println("Sorry, Item unavailable.");
else
{
System.out.println("Enter new Item code: "); ar.get(indx).setItem(new Scanner(System.in).nextInt()); System.out.println("Enter new Item name: "); ar.get(indx).setName(new Scanner(System.in).nextLine());
 
System.out.println("Enter new Item rate: "); ar.get(indx).setRate(new Scanner(System.in).nextDouble()); display();
}
}
void viewItemDetails()
{
System.out.println("Items available are:- "); for(int i=0;i<ar.size();i++)
{
System.out.println(ar.get(i).getItem()+" "+ar.get(i).getRate()+" "+ar.get(i).getQuantity());
}
}
void Bill()
{
if(item.size()==0)
{
System.out.println("Opps!\nCart's empty.\nAdd something in cart."); return;
}
System.out.println("Items purchased:- "); for(int i=0;i<item.size();i++)
System.out.println(item.get(i)); System.out.println("Total amount payable: "+amt);
}
}
class Grocery_menu
{
void menu()
 
{
GroceryAccess ob=new GroceryAccess(); int ch;
do{
System.out.println("Press 1 to add new item\nPress 2 to Update product details\nPress 3 to purchase or add an item\nPress 4 to view price and quantity of an item\nPress 5 to display items\nPress 6 to generate bill");
ch=new Scanner(System.in).nextInt(); switch(ch)
{
case 1:ob.add();break; case 2:ob.details();break; case 3:ob.buy_sell();break;
case 4:ob.viewItemDetails();break; case 5:ob.display();break;
case 6:ob.Bill();break; default:System.out.println("Invalid input");
}
System.out.println("Press 1 to continue and 2 to exit."); ch=new Scanner(System.in).nextInt();
}while(ch==1);
}
public static void main(String args[])
{
new Grocery_menu().menu();
}
}

