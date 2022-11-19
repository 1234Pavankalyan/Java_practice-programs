//write a java program to find sum of even numbers in the array(one dimrensional).
import java.util.*;
class EvenSum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size");
    int n=sc.nextInt();
    int sum=0;
    int a[]=new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
  for(int i=0;i<a.length;i++){
    if(a[i]%2==0){
      sum=sum+a[i];
    }
  }
 
System.out.println("The sum of even numbers :"+sum);
}
}