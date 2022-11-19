1.Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 
'specialization' and 'department' respectively.
 Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.

class Member{
  String name;
  int age;
  long phoneno;
  String address;
  int salary;
   void printSalary(){
    System.out.println("print slary:"+salary);
  }
  
}
class Employee extends Member{
  String specialization;
  String department;
}
class Manager extends Member{
  String department;
  String specialization;
  
}

class Student1{
  public static void main(String args[]){
  Employee e=new Employee();
  e.name="shan";
  e.age=23;
  e.phoneno=9806543352l;
  e.address="asam";
  e.salary=12356;
  e.specialization="M.tech";
  e.department="Robotics";
  
 System.out.println(e.name+" "+e.age+" "+e.phoneno+" "+e.address+" "+e.salary+" "+e.specialization+" "+e.department);
     e.printSalary();
 Manager m=new Manager();
  m.name="anjali";
  m.age=18;
  m.phoneno=9806546666l;
  m.address="andra";
  m.salary=100000;
  m.specialization="B.tech";
  m.department="fullstack";

System.out.println(m.name+" "+m.age+" "+m.phoneno+" "+m.address+" "+m.salary+" "+m.specialization+" "+m.department);
    m.printSalary();
}
}