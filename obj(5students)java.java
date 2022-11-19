write a details for 5employes details 


import java.util.*;
class Employee{
  int eid;
  String ename;
  String edept;
  int esalary;
  long ephoneno;

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
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++){
      e[i]=new Employee();
      System.out.println("Enter employee "+ (i+1)+" details" );
      System.out.println("Enter id");
      e[i].eid=sc.nextInt();
      System.out.println("Enter name");
      e[i].ename=sc.next();
      System.out.println("Enter department");
      e[i].edept=sc.next();
      System.out.println("Enter Salarly");
      e[i].esalary=sc.nextInt();
      System.out.println("enter phone no");
      e[i].ephoneno=sc.nextLong();
    }

    //display data
    for(int i=0;i<5;i++){
       System.out.println(e[i].eid+" "+e[i].ename+" "+e[i].edept+" "+e[i].esalary+" "+e[i].ephoneno);
    e[i].grossSalary(e[i].esalary);
    e[i].insurence(e[i].esalary);

  }    
  }   
  }