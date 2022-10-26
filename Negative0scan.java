//number is negative or not 
import java.util.*;
class lesser0scan{
  public static void main(String args[]){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    num=sc.nextInt();
    if(num<=0)
      System.out.println("enter it is a negative number");
      else
      System.out.println("enter it is not a negative number");
    }
  } 