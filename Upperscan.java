import java.util.Scanner;
class Upperscan{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    char ch;
    System.out.println("Enter a character");
   ch=sc.next().charAt(0);
    if((ch>='a')&&(ch<='z'))
    {
      System.out.println("lower case");
    }
    else if((ch>='A')&&(ch<='Z'))
    {
      System.out.println("upper case");
    }
    else
    {
      System.out.println(" invalid");
    }
  }
  }