//find the count the numbers in digits by for loop
  

    import java.util.*;
class Sample{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    int count=0;
    
    while(n>0)
      {
        count++;
        n=n/10;
      }
    System.out.println(count);
    }
  }