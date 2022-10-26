write a program to check whether it is a positive or negative
import java.util.Scanner;
class Greaterelseifscan.java{
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int num=sc.nextInt();
    if(num>0)
      System.out.println("Positive");
    else if(num<0)
      System.out.println("Negative");
    else
      System.out.println("Zero");
  }
}