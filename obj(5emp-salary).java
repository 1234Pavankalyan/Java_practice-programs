Write a salary details 5employes by using for loop


import java.util.*;
class Employee{
  int eid;
  String ename;
  String edept;
  int esalary;
  long ephoneno;
Scanner sc=new Scanner(System.in);
  void input(){
    int i=0;
    System.out.println("Enter employee "+ (i+1)+" details" );
      System.out.println("Enter id");
    eid=sc.nextInt();
      System.out.println("Enter name");
    ename=sc.next();
      System.out.println("Enter department");
      edept=sc.next();
      System.out.println("Enter Salarly");
      esalary=sc.nextInt();
      System.out.println("enter phone no");
      ephoneno=sc.nextLong();
  }
  void display(){
    System.out.println("eid= "+eid);
    System.out.println("ename="+ename);
    System.out.println("edept="+edept);
    System.out.println("esalary= "+esalary);
    System.out.println("ephone no= "+ephoneno);
  }

  void grossSalary(int bsalary){
    if(bsalary<10000){
      int gs=2000+2000+bsalary;
      System.out.println(gs);
    }
    else{
      int gs=1000+1000+bsalary;
      System.out.println(gs);
    }
  }

  void insurence(int bsalary){
    if(bsalary<10000){
      System.out.println("Not elegible");
    }
    else{
      System.out.println("eliegible");
    }
  }
}

class Sample{
  public static void main(String args[]){
  Employee e[]=new Employee[5];
    for(int i=0;i<5;i++){
      e[i]=new Employee();
      e[i].input();
    }
     for(int i=0;i<5;i++){
      e[i].display();
    }
    
   
       
  }   
  }