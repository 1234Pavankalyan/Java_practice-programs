write a program to eligible for vote or not

import java.util.*;
class Sample{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter age");
    int age=sc.nextInt();
    if(age>18){
      System.out.println("Eligible for vote");
    }
    else{
      System.out.println("Not Eligible for vote");
    }
  }
}