//1.Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with the same name 
//'printn' having a parameter for each datatype.




class PrintNum{
  void printn(int a,int b){
  System.out.println(a+" "+b);
  }
  void printn(int a,float b){
  System.out.println(a+" "+b);
  }
  void printn(float a,int b){
  System.out.println(a+" "+b);
  }
  void printn(int a,int b,int c){
  System.out.println(a+" "+b+" "+c);
  }
  void printn(float a,float b){
  System.out.println(a+" "+b);
  }
}
class PrintNumber{
  public static void main(String args[]){
    PrintNum printn1=new PrintNum();
    printn1.printn(2,3);
     printn1.printn(2,3.5f);
     printn1.printn(2.3f,3);
     printn1.printn(2,3,4);
     printn1.printn(2.5f,3.2f);
    
  }
}
