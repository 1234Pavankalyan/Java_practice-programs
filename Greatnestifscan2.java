write a program to check which number is greater


import java.util.Scanner;
class Greatnestifscan2 {
  public static void main(String args[]) {
    int a=5,b=10,c=30;
    if(a>b){
      if(a>c){
        System.out.println("a is big");
      }
     
    }
    else if(b>c){
      System.out.println("b is greater");
    }
    else{
      System.out.println("c is greater");
    }
    
  }
}