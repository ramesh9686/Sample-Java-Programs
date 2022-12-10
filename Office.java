class members{
    String name; 
    int age; 
    long phoneNumber; 
    String address;
    int salary;
    
    public members(String name, int age, long phoneNumber, String address){
        this.name=name;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.address=address;
        System.out.printf("\n\ndetails: \nname: %s\nage: %d\nphoneNumber: %d\naddress: %s",name,age,phoneNumber,address);
    }
    public void printSalary(int salary){
        this.salary= salary;
        System.out.printf("\nsalary: %d\n",salary);
    }
}
class manager extends members{
    String department;

    public manager(String name, int age, long phoneNumber, String address,String department) {
        super(name, age, phoneNumber, address);
        System.out.printf("\ndepartment: %s",department);
    }
    
}
class employee extends members{
    String specialization;

    public employee(String name, int age, long phoneNumber, String address,String specialization) {
        super(name, age, phoneNumber, address);
        System.out.printf("\nspecification: %s",specialization);
    }
    
}
public class Office {
    public static void main(String[] args) {
        
        employee obj1=new employee("Phineas",24,993962415,"1st main road","Higher levels of productivity");
        obj1.printSalary(177000);                                                //for the employee
        
        manager obj2=new manager("Ferb",24,993962415,"3rd street","Marketing");
        obj2.printSalary(200000);                                               //for the manager
    }    
}
