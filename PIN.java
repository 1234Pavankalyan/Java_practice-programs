import java.util.Scanner;
class PIN{
  public static void main(String[] args)
  {
    char d;
   Scanner sc=new Scanner(System.in);
    do{
    System.out.println("enter pin ");
   int pin=sc.nextInt();
      int count=0;
       System.out.println("Enter the amount");
    int amount = sc.nextInt();
    
    while(pin>0)
      {
        count++;
        pin=pin/10;    
      }
    if(count==4){
      System.out.println("correct pin");
       System.out.println("Select amount\n 1 withdraw\n 2.deposit\n 3.checkbalance\n5.For exit");
    System.out.println("Enter the option");
    int option =sc.nextInt();
    if (option==1){
        int amount1=sc.nextInt();
        int withdraw =amount-amount1;
        System.out.println("the amoumt withdraw are " +withdraw);
    }
     else if(option==2){
        int amount2=sc.nextInt();
       int withdraw=sc.nextInt();
       amount2=withdraw+1000;
        int deposit =withdraw+amount2;
        System.out.println("the deposit amount are " + deposit);
     }
     else if(option==3){
       int amount2=sc.nextInt();
        int checkbalance=amount2;
       System.out.println("the balance anount are" +checkbalance);
     }
      else if(option==4){
        System.out.println("thank you for exit");
    }
    }
     else{
    System.out.println("wrong pin");
    }
    System.out.println("Do you want search again \n 1. Type y for search again \n 2. Type n for Exit");
     d=sc.next().charAt(0);
  }
      while (d=='y');
}
}