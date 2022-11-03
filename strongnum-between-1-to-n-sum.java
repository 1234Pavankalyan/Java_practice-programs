16)  find the strong number between 1 to n and their sum
 


     import java.util.*;
class Sample{
  public static void main(String args[])
  { 
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();//160
    int count,sum=0,temp,rem,fact;
    for(int i=1;i<=n;i++){ //1<=160
     temp=i;
      while(temp>0){
        rem=temp%10;
        fact=1;
        for(int j=1;j<=rem;j++){
          fact=fact*j;
        }
       
        sum=sum+fact;
        temp=temp/10;
      }
      if(sum==i){
        System.out.println(i);
      }
       sum=0;
    }
    
    }
  }