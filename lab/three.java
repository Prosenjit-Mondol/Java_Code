/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;
class Address{
    String city,state,country;
    Address(String city,String state,String country){
        this.city=city;
        this.country=country;
        this.state=state;
    }
}
class Member{
    String phone,name,address;
    int age;
    double salary;
    void printsalary(){
        System.out.println("Salary: "+salary);
    }
}
class Employee extends Member {                
        String specialization;
    
    public Employee(String name, int age, String phoneNumber, double salary, String specialization) { 
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.specialization = specialization;
    
    }
    
    }
    
    class Manager extends Member { 
        String department;
    
    public Manager(String name, int age, String phone, double salary, String department) {
    
    this.name = name;
    
    this.age = age;
    
    this.phone = phone;
    
    this.salary = salary;
    
    this.department = department;
    
    }
    
    }
public class three {
    public static void main(String[] args) {
        
   Address address1=new Address("Rajshahi","Bharendra","Bangladesh");
   
   Address address2=new Address("Rajshahi","Bharendra","Bangladesh");  
 
    Employee employee = new
    
    Employee("John Doe", 25, "123456789", 5000.0, "Software Development");
    
    Manager manager = new
    
    Manager("Jane Smith", 30, "987654321", 8000.0, "Operations");
    
    System.out.println("Employee:");
    
    System.out.println("Name: " +employee.name);
    
    System.out.println("Age: " +employee.age);
    
    System.out.println("Phone number: "+ employee.phone);
    
    System.out.println("Address: " +address1.city+" ,"+address1.state+" ,"+address1.country);
        
    employee.printsalary();
    
    System.out.println("Specialization: "+ employee.specialization);
    
    System.out.printf("\n\n");
    
    System.out.println("Manager:"); 
    
    System.out.println("Name: " + manager.name);
    
    System.out.println("Age: " +manager.age); 
    
    System.out.println("Phone number: "+ manager.phone);
    
    System.out.println("Address: " +address2.city+" ,"+address2.state+" ,"+address2.country); 
    
    employee.printsalary();
    
    System.out.println("Department: " + manager.department);
    
    }
}
