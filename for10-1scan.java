 write a program to print from 10 to 1 scanner by using for loop
 import java.util.*;
 class Number{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the n value");
  int n=sc.nextInt();
    for(int i=n;i>0;i--){
      System.out.println(i);
    }
  }
 }