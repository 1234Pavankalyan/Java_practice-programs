 write a program to print TABLE by using for loop

import java.util.*;
class Table{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=s.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(num+" * "+i+" = "+num*i);
    }
  }
}