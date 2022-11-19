//write a java program to print all the  odd numbers in a array
import java.util.*;
class Array12{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of the array");
    int size=sc.nextInt();
   int a[]=new int[size];
    System.out.println("enter array values");
      for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
      }
    for(int i=0;i<a.length;i++){
      if(a[i]%2!=0){
        System.out.println(a[i]);
      }
      
    }
  }
}