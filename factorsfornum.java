//1)find the factors of a number

import java.util.*;
class Sample{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
   int num=sc.nextInt();
    for(int i=1;i<=num/2;i++)
      {
        if(num%i==0)
        {
          System.out.println(i);
        }
      }
    }
  }