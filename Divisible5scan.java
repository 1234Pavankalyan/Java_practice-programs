import java.util.*;
  class Divisible5scan
    {
      public static void main(String args[]){
        int num;
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
        if(num%5==0){
      System.out.println("divisible");
      }
      else {
        System.out.println("not dividible");
      }
      }
    }