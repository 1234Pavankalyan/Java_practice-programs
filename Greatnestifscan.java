nested if 

write a program for a given number is greater

import java.util.Scanner;

class Greatenestifscan {
  public static void main(String args[]) {
    int a=50,b=10,c=30;
    if(a>b){
      if(a>c){
        System.out.println("a is big");
      }
      else
      {
        System.out.println("c is big");
      }
    }
    else if(b>c){
      System.out.println("b is greater");
      
    }
    
  }
}