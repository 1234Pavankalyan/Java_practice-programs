enter the employee details by using constructor concept

import java.util.*;
class Employee{
  int eid;
  String ename;
  String edept;
  int esalary;
  long ephoneno;
  Employee(){
    eid=123;
    ename="lalitha";
    edept="Accounts";
    esalary=23000;
    ephoneno=9876564523L;
  } 
  Employee(int id,String name,String dept,int salary,long phoneno){
    eid=id;
    ename=name;
    edept=dept;
    esalary=salary;
    ephoneno=phoneno;
  }
  Employee(int id){
    eid=id;
  }
Employee(int id,String name){
  eid=id;
  ename=name;
}
  
}


class Sample{
  public static void main(String args[]){
  // 
    Employee e=new Employee();
    System.out.println(e.eid);
    Employee e1=new Employee(345,"anitha","IT",120000,89765634L);
    System.out.println(e1.eid+" "+e1.ename);
    Employee e2=new Employee(678);
    System.out.println(e2.eid);
    Employee e3=new Employee(378,"kavitha");
    System.out.println(e3.eid+" "+e3.ename);
    
   
       
  }   
  }
