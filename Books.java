/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramesh;
import java.util.*;
public class Books
{
private int quantity; private double price;
private String Book_ID,Title,author_name,publisher;
void set(String b,int q,double p,String t,String a,String pb)
{
Book_ID=b; quantity=q; price=p; Title=t; author_name=a; publisher=pb;
}
String getId(){
    return Book_ID;
} 
int getQuantity(){
    return quantity;
}
double getPrice(){
    return price;
}
String getTitle(){
    return Title;
}
String getAuthor(){
    return author_name;
}
String getPublisher(){
    return publisher;
}
} 
     
class Access 
{
ArrayList <Books> ar; Access()
{
ar=new ArrayList<>(2);
}
void gen(int n)
{
System.out.println("Press 1 to add\nPress 2 to return"); 
if(new Scanner(System.in).nextInt()==2)
{
int indx=search_id(); if(indx!=-1)
{
ar.get(indx-1).set(ar.get(indx-1).getId(), ar.get(indx-1).getQuantity()+n, ar.get(indx-1).getPrice(), ar.get(indx-1).getTitle(), ar.get(indx-1).getAuthor(), ar.get(indx-1).getPublisher());
return;
}
}
System.out.println("Enter the details one by one in order:- "); for(int i=1;i<=n;i++)
{
System.out.println("Enter details of book "+i+" :"); Books ob=new Books();
ob.set(new Scanner(System.in).nextLine(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextDouble(),new Scanner(System.in).nextLine(),new Scanner(System.in).nextLine(),new Scanner(System.in).nextLine());
ar.add(ob);
}
}
void search()
{
System.out.println("Press 1 to search using book id\nPress 2 to search using title\nPress 3 to search using author");
int ch=new Scanner(System.in).nextInt();
 
int indx; if(ch==1)
indx=search_id(); else if(ch==2)
indx=search_title(); else
indx=search_author(); if(indx==-1)
System.out.println("Invalid entry."); else
{
if(ar.get(indx-1).getQuantity()==0)
{
System.out.println("Sorry book is not available currently.");return;
}
System.out.println("Book issued");
ar.get(indx-1).set(ar.get(indx-1).getId(), ar.get(indx-1).getQuantity()-1, ar.get(indx-1).getPrice(), ar.get(indx-1).getTitle(), ar.get(indx-1).getAuthor(), ar.get(indx-1).getPublisher());
}
}
int search_id()
{
System.out.println("Enter the id: ");
String id=new Scanner(System.in).nextLine(); for(int i=1;i<=ar.size();i++)
{
if(id.equalsIgnoreCase(ar.get(i-1).getId())) return i;
}
return -1;
}
int search_title()
{
System.out.println("Enter the title: ");
 
String title=new Scanner(System.in).nextLine(); for(int i=1;i<=ar.size();i++)
{
if(title.equalsIgnoreCase(ar.get(i-1).getTitle())) return i;
}
return -1;
}
int search_author()
{
System.out.println("Enter the author: ");
String author=new Scanner(System.in).nextLine(); for(int i=1;i<=ar.size();i++)
{
if(author.equalsIgnoreCase(ar.get(i-1).getAuthor())) return i;
}
return -1;
}
void sortId()
{
for(int i=0;i<ar.size()-1;i++)
{
for(int j=0;j<ar.size()-i-1;j++)
{
if(ar.get(j).getId().compareTo(ar.get(j+1).getId())>1)
{
String temp=ar.get(j+1).getId();
int temp1=ar.get(j+1).getQuantity(); double temp2=ar.get(j+1).getPrice(); String temp3=ar.get(j+1).getTitle(); String temp4=ar.get(j+1).getAuthor(); String temp5=ar.get(j+1).getPublisher();
 
ar.get(j+1).set(ar.get(j).getId(),ar.get(j).getQuantity() , ar.get(j).getPrice(), ar.get(j).getTitle(), ar.get(j).getAuthor(), ar.get(j).getPublisher());
ar.get(j).set(temp, temp1, temp2, temp3, temp4, temp5);
}
}
}
}
void sortTitle()
{
for(int i=0;i<ar.size()-1;i++)
{
for(int j=0;j<ar.size()-i-1;j++)
{
if(ar.get(j).getTitle().compareTo(ar.get(j+1).getTitle())>1)
{
String temp=ar.get(j+1).getId();
int temp1=ar.get(j+1).getQuantity(); double temp2=ar.get(j+1).getPrice(); String temp3=ar.get(j+1).getTitle(); String temp4=ar.get(j+1).getAuthor(); String temp5=ar.get(j+1).getPublisher();
ar.get(j+1).set(ar.get(j).getId(),ar.get(j).getQuantity() , ar.get(j).getPrice(), ar.get(j).getTitle(), ar.get(j).getAuthor(), ar.get(j).getPublisher());
ar.get(j).set(temp, temp1, temp2, temp3, temp4, temp5);
}
}
}
}
void sortAuthor()
{
for(int i=0;i<ar.size()-1;i++)
{
for(int j=0;j<ar.size()-i-1;j++)
{
 
if(ar.get(j).getAuthor().compareTo(ar.get(j+1).getAuthor())>1)
{
String temp=ar.get(j+1).getId();
int temp1=ar.get(j+1).getQuantity(); double temp2=ar.get(j+1).getPrice(); String temp3=ar.get(j+1).getTitle(); String temp4=ar.get(j+1).getAuthor(); String temp5=ar.get(j+1).getPublisher();
ar.get(j+1).set(ar.get(j).getId(),ar.get(j).getQuantity() , ar.get(j).getPrice(), ar.get(j).getTitle(), ar.get(j).getAuthor(), ar.get(j).getPublisher());
ar.get(j).set(temp, temp1, temp2, temp3, temp4, temp5);
}
}
}
}
void display()
{
System.out.println("Press 1 to display using book id\nPress 2 to display using title\nPress 3 to display using author");
int ch=new Scanner(System.in).nextInt(); if(ch==1)
sortId(); else if (ch==2)
sortTitle(); else
sortAuthor(); if(ar.isEmpty())
{
System.out.println("The list is empty."); return;
}
System.out.println("The books:"); for (Books ob : ar) {
System.out.println(ob.getId()+" "+ob.getTitle()+" "+ob.getAuthor()+" "+ob.getPublisher()+" "+ob.getQuantity()+" "+ob.getPrice());
 
}
}
}
class Menu
{
void Initial_Menu()
{
Access ob=new Access(); int ch;
do{
System.out.println("Press 1 to add/return book(s).\nPress 2 to search and issue a book.\nPress 3 to see all the stored books");
ch=new Scanner(System.in).nextInt(); switch(ch)
{
case 1:System.out.println("Enter the number of book(s) to be added/returned: "); ob.gen(new Scanner(System.in).nextInt());
break;
case 2:ob.search(); break;
case 3:ob.display(); break;
default:System.out.println("Wrong choice.");
}
System.out.println("Press 1 to continue\nPress 2 to exit"); ch=new Scanner(System.in).nextInt();
}while(ch==1);
}
public static void main(String args[])
 
{
new Menu().Initial_Menu();
}
}

