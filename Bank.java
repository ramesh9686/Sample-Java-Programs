/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
abstract class Bank1{
 abstract int getBalance();
}
class BankA extends Bank1{
 int deposit=100;
 int getBalance() {
  return deposit;
 }
}
class BankB extends Bank1{
 int deposit=150;
 int getBalance(){
  return deposit;
 }
}
class BankC extends Bank1{
 int deposit=200;
 int getBalance(){
  return deposit;
 }
}
class mains{
 public static void main(String args[]){
  BankA a=new BankA();
  System.out.println("Balance in Bank A: "+a.getBalance());
  BankB b=new BankB();
  System.out.println("Balance in Bank B: "+b.getBalance());
  BankC c=new BankC();
  System.out.println("Balance in Bank C: "+c.getBalance()); 
 }
}
