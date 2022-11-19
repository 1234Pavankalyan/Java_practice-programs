with out parameter & with out reference

class Employee{
  int eid;
  String ename;
  String edept;
  int esalary;
  long ephoneno;

  void grossSalary(int esalary){
    if(esalary<10000){
      int gs=2000+2000+esalary;
      System.out.println(gs);
    }
    else{
      int gs=1000+1000+esalary;
      System.out.println(gs);
    }
  }

  void insurence(int esalary){
    if(esalary<10000){
      System.out.println("Not elegible");
    }
    else{
      System.out.println("eliegible");
    }
  }
}

class Sample{
  public static void main(String args[]){
    Employee e1=new Employee();
    e1.eid=12;
    e1.ename="lalitha";
    e1.edept="Accounts";
    e1.esalary=25000;
    e1.ephoneno=2345677L;
        System.out.println(e1.eid+" "+e1.ename+" "+e1.edept+" "+e1.esalary+" "+e1.ephoneno);
    e1.grossSalary(e1.esalary);
    e1.insurence(e1.esalary);

  }   
  }