import java.util.*;
class Weekdayscan{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the week number: ");
    int week=sc.nextInt();
    if(week==1){
      System.out.println("this is sunday");  
    }
    else if(week==2){
      System.out.println("this is monday");
    }
    else if(week==3){
      System.out.println("this is Tuesday");
    }
    else if(week==4){
      System.out.println("this is Wednes");
    }
    else if(week==5){
      System.out.println("this is Thursday");
    }
    else if(week==6){
      System.out.println("this is Friday");
    }
    else if(week==7){
      System.out.println("this is Saturday");
    }
  }
}