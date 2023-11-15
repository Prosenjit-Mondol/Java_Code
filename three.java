/**
 * Member
 */
class Member {
    String name,address;
    int age,phone,salary;
    public void printSalary(){
        System.out.println("Salary of the member :"+salary);
    }
}
class Employee extends Member{
    String specialization;
}
class Manager extends Member{
    String department;
}
public class three {
    
}
