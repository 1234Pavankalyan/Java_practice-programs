 write a program to print from 10 to 1  scanner by using while loop       


 import java.util.*;
 class Number{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
     System.out.println("Enter the n value");
     int n=sc.nextInt();
     int i=n;
    while(i>0){
      System.out.println(i);
       i--;
    }
  }
 }