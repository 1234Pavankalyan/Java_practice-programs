class A
  {
    A()
    {
      System.out.println("a");
    }
  }
class B
  {
    B()
    {
      System.out.println("b");
    }
  }
class C extends B
  {
    C()
    {
      System.out.println("c");
    }
  }
class Sample{
  public static void main(String args[]){
      C c=new C();
  }


}
