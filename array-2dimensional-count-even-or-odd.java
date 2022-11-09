counting even & odd in two dimensional array

import java.util.*;
class Array1{
  public static void main(String args[])
  { 
    int a[][]=new int[2][2];
    int even_count=0, odd_count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array elements");
    System.out.println("enter the array row and columns");
    int row=sc.nextInt();
    int col=sc.nextInt();
    
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
      a[i][j]=sc.nextInt();
    }
    }
    for (int i=0;i<a.length;i++){
      for (int j=0;j<a.length;j++){
      if(a[i][j]%2==0){
        even_count++;  
      }
     else
        odd_count++;
    }
    }
  System.out.println(even_count++);
    System.out.println(odd_count++);
    }
  }