import java.util.Scanner;
class employee{
    String Emp_name;
    int Emp_ID;
    String Address, Email_ID;
    long MobileNumber;
    double bp,da,hra,pf,clubFunds;
    public employee(String Emp_name, int Emp_ID, String Address, String Email_ID, long MobileNumber){
        this.Emp_name=Emp_name;
        this.Emp_ID=Emp_ID;
        this.Address=Address;
        this.Email_ID=Email_ID;
        this.MobileNumber=MobileNumber;
    }
    public void payslip(){
        hra=bp*0.10;
        da=bp*97;
        pf=bp*0.12;
        clubFunds=bp*0.001;
        System.out.printf("\nSalary details:\nBP: %f\nHRA: %f\nDA: %f\nPF: %f\nclub funds: %f",bp,hra,da,pf,clubFunds);
    }
    
}    
    
class programer extends employee{
         
    public programer(String Emp_name, int Emp_ID, String Address, String Email_ID, long MobileNumber) {
        super(Emp_name, Emp_ID, Address, Email_ID, MobileNumber);
        System.out.printf("\nprogrammer name: %s\nprogrammer id: %d\nemail id: %s\nmobile number: %d",Emp_name,Emp_ID,Email_ID,MobileNumber);
        bp=679000;
    }
    
}
class ResearchScholar extends employee{
        
    public ResearchScholar(String Emp_name, int Emp_ID, String Address, String Email_ID, long MobileNumber) {
        super(Emp_name, Emp_ID, Address, Email_ID, MobileNumber);
        System.out.printf("\nResearch Scholar's name: %s\nResearch Scholar's id: %d\nemail id: %s\nmobile number: %d",Emp_name,Emp_ID,Email_ID,MobileNumber);
        bp=97000+20000;  //BP + STI Fund for Research Scholar
        
    }
        
}
class AssistantProfessor extends employee{
        
    public AssistantProfessor(String Emp_name, int Emp_ID, String Address, String Email_ID, long MobileNumber) {
        super(Emp_name, Emp_ID, Address, Email_ID, MobileNumber);
        System.out.printf("\nAssistant Professor's name: %s\nAssistant Professor's id: %d\nemail id: %s\nmobile number: %d",Emp_name,Emp_ID,Email_ID,MobileNumber);
        bp=159000;
    }
        
}
class AssociateProfessor extends employee{
        
    public AssociateProfessor(String Emp_name, int Emp_ID, String Address, String Email_ID, long MobileNumber) {
        super(Emp_name, Emp_ID, Address, Email_ID, MobileNumber);
        System.out.printf("\nAssociate Professor's name: %s\nAssociate Professor's id: %d\nemail id: %s\nmobile number: %d",Emp_name,Emp_ID,Email_ID,MobileNumber);
        bp=125000;
    }
        
}
class Professor extends employee{
       
    public Professor(String Emp_name, int Emp_ID, String Address, String Email_ID, long MobileNumber) {
        super(Emp_name, Emp_ID, Address, Email_ID, MobileNumber);
        System.out.printf("\nProfessor's name: %s\nProfessor's id: %d\nemail id: %s\nmobile number: %d",Emp_name,Emp_ID,Email_ID,MobileNumber);
        bp=110100;
    }
        
}
    
public class OfficeClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("\nDo you want to viwe employee details? select 1 for yes and 2 for no: ");
        int x=input.nextInt();
        if(x==1){
        System.out.println("1.Programmer\n2.Research Scholar\n3.Assistant Professor\n4.Associate Professor\n5.Professor \nselect the employee details you want to viwe[1/2/3/4/5]: ");
        int y= input.nextInt();
        switch(y){
            case 1: 
                programer obj1=new programer("Phineas",9542,"1st main road","phineas@gmail.com",99543234);
                obj1.payslip();
                break;
            case 2:
                ResearchScholar obj2=new ResearchScholar("Ferf",9543,"2nd main road","ferb@gmail.com",995432346);
                obj2.payslip();
                System.out.printf("\nSTI Fund: 20000\n");
                break;
            case 3:
                AssistantProfessor obj3=new AssistantProfessor("Perry",9544,"3rd main road","perry@gmail.com",995432347);
                obj3.payslip();
                break;
            case 4:
                AssociateProfessor obj4=new AssociateProfessor("Mailo",9545,"4th main road","mailo@gmail.com",995432348);
                obj4.payslip();
                break;
            case 5:
                Professor obj5=new Professor("McGonegal",9546,"1st main road","MC@gmail.com",995432349);
                obj5.payslip();
                break;
            default:
                System.out.printf("\nEnter a valid choise");  
        }
        }
        else{
            System.out.printf("\nThank You");
        }
    }
}
