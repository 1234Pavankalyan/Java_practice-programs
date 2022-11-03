to print a  "*" triangle

import java.util.*;
class Sample{
  public static void main(String args[])
  { 
     
     for(int i=0;i<5;i++)//i=1;
       {
         for(int j=5-i;j>1;j--){//j=4;j>1  3
           System.out.print(" ");
         }
         for(int j=0;j<=i;j++){//j=0;1<=0 2
           System.out.print("* ");
         }

         
        System.out.println();
       }
    
    }
  }