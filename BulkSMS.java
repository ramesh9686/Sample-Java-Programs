import java.util.*; interface SMS{
Scanner sc=new Scanner(System.in); void sendSMS();
boolean checkForDND();
boolean checkForTelecomRules();
}
class Airtel implements SMS{ public boolean checkForDND(){
System.out.print("Enter 0 for consumer in DND list and 1 for consumer not in DND list:"); int n=sc.nextInt();
 
if(n==0) return false;
else
return true;
}
public boolean checkForTelecomRules(){
System.out.print("Enter 0 if government rules and telecom rules are obeyed and enter 1 if not obeyed:");
int n=sc.nextInt(); if(n==0)
return true; else
return false;
}
public void establishConnectionWithYourTower(){ System.out.println("SMS sent in Airtel.");
}
public void destroyConnectionWithYourTower(){ System.out.println("SMS not sent in Airtel.");
}
public void sendSMS(){ if(checkForTelecomRules()==true){
System.out.print("Enter number of customers SMS need to be sent:"); int n=sc.nextInt();
for(int i=0;i<n;i++){ if(checkForDND()==true){
int x=i+1;
System.out.print("For "+x+" customer:"); establishConnectionWithYourTower();
}
else{
int x=i+1;
System.out.print("For "+x+" customer:"); destroyConnectionWithYourTower();
 
}
}
}
else
destroyConnectionWithYourTower();
}
}
class France_Telecom implements SMS{ public boolean checkForDND(){
System.out.print("Enter 0 for consumer in DND list and 1 for consumer not in DND list:"); int n=sc.nextInt();
if(n==0) return false;
else
return true;
}
public boolean checkForTelecomRules(){
System.out.print("Enter 0 if government rules and telecom rules are obeyed and enter 1 if not obeyed:");
int n=sc.nextInt(); if(n==0)
return true; else
return false;
}
public void establishConnectionWithYourTower(){ System.out.println("SMS sent in France Telecom.");
}
public void destroyConnectionWithYourTower(){ System.out.println("SMS not sent in France Telecom.");
}
public void sendSMS(){ if(checkForTelecomRules()==true){
System.out.print("Enter number of customers SMS need to be sent:");
 
int n=sc.nextInt(); for(int i=0;i<n;i++){
if(checkForDND()==true){ int x=i+1;
System.out.print("For "+x+" customer:"); establishConnectionWithYourTower();
}
else{
int x=i+1;
System.out.print("For "+x+" customer:"); destroyConnectionWithYourTower();
}
}
}
else
destroyConnectionWithYourTower();
}
}
class Vodafone implements SMS{ public boolean checkForDND(){
System.out.print("Enter 0 for consumer in DND list and 1 for consumer not in DND list:"); int n=sc.nextInt();
if(n==0) return false;
else
return true;
}
public boolean checkForTelecomRules(){
System.out.print("Enter 0 if government rules and telecom rules are obeyed and enter 1 if not obeyed:");
int n=sc.nextInt(); if(n==0)
return true; else
 
return false;
}
public void establishConnectionWithYourTower(){ System.out.println("SMS sent in Vodafone.");
}
public void destroyConnectionWithYourTower(){ System.out.println("SMS not sent in Vodafone.");
}
public void sendSMS(){ if(checkForTelecomRules()==true){
System.out.print("Enter number of customers SMS need to be sent:"); int n=sc.nextInt();
for(int i=0;i<n;i++){ if(checkForDND()==true){
int x=i+1;
System.out.print("For "+x+" customer:"); establishConnectionWithYourTower();
}
else{
int x=i+1;
System.out.print("For "+x+" customer:"); destroyConnectionWithYourTower();
}
}
}
else
destroyConnectionWithYourTower();
}
}
public class BulkSMS {
public static void main(String[] args) { Airtel a=new Airtel();
France_Telecom f=new France_Telecom(); Vodafone v=new Vodafone();
 
System.out.println("SMS through Airtel."); a.sendSMS();
System.out.println("\nSMS through France Telecom."); f.sendSMS();
System.out.println("\nSMS through Vodafone."); v.sendSMS();
}
}
