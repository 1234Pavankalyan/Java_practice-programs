7)to print positive number by array
import java.util.*;
class Sample{
  public static void main(String args[])
  { 
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array elements");
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++){
      if(a[i]>0){
         System.out.println(a[i]);
      }
     
    }
    
    }
  }