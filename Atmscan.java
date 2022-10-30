ATM operation

  amount=10000

1.withdraw
2.deposit
3.check balance
4.exit

  select option
  1
//  enter amount to withdraw
//  500
//  amount=amount-500;
// withdraw successfully

  2
  // Enter amount to deposit
   //depsoit=1000
 // amount=amount+deposit

  3.
 // the amount is 11000

  4
  //System.out.print("thank you for visiting");





import java.util.*;
class Atmscan {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the amount");
    int amount = s.nextInt();
    System.out.println("Select amount\n 1 withdraw\n 2.deposit\n 3.checkbalance\n5.For exit");
    switch (Atmscan) {
      case 1:
        int amount = 10000;
        System.out.println("the amount was "+ amount);
        break;
      case 2:
        int withdraw =amount-500;
        System.out.println("the amoumt withdraw are " +withdraw);
        break;
      case 3:
        int amount1=withdraw+1000;
        int deposit =withdraw+amount1;
        System.out.println("the deposit amount are " + deposit);
      case 4:
        int checkbalance=amount1;
       system.out.println("the balance anount are" +checkbalance);
        break;
      default:
        System.out.println("thank you for exit");
    }
  }
}