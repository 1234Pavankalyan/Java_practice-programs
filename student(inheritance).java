class Student{
  int id;
  String name;
  Student(int id,String name){
    this.id=id;
    this.name=name;
  }
  
}
class Emp extends Student{
  //int id;
//String name;
  int salary;
  Emp(int id,String name,int salary){
    super(id,name);
    this.salary=salary;
  }
  void display(){
    System.out.println(id+name+salary);
  }
}
class Sample{
  public static void main(String args[]){
    
  Emp e=new Emp(1,"lalitha",67000);
    e.display();
    
  }
}