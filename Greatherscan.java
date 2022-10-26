import java.util.*;
class Greatherscan{
  public static void main(String args[])
  {  
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a");
     a=sc.nextInt();
     System.out.println("enter b");
     b=sc.nextInt();
    if(a>b){
      System.out.println("number a is big");
    }
    else{
      System.out.println("number is b");
    }
  }
}