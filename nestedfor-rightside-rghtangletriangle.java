to print a right side right angle triangle

     import java.util.*;
class Sample{
  public static void main(String args[])
  { 
     int a=1;
     for(int i=0;i<5;i++)//1<=5//rows
       {
         for(int j=0;j<=i;j++){//0<=5
           System.out.print("*" +" ");    
         }
         System.out.println();
       }
    
    }
  }