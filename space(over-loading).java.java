//create a class variable in have use oveloading concept a display int varia,string obj,double varia
  class variable{
  void print(int a,String n,double k ){
    System.out.println(a+" "+n+" "+k);
  }
     void print(String n,int a,double k ){
    System.out.println(n+" "+a+" "+k);
  } 
    void print(double k,String n,int a ){
    System.out.println(k+" "+n+" "+a);
  }
  }
class space{
  public static void main(String args[]){
    variable e=new variable();
    e.print(10,"pavan",6302424l);
    e.print("aryan",20,330454l);
    e.print(935478l,"vidyuth",10);
  }
}