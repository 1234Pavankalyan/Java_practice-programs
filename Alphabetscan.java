write a program to print a alphabet by using if-else condition
import java.util.scanner;
class Alphabet {
  public static void main(String args[]) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the alphabet");
    char ch = sc.next().charAt(0);
    if(( ch >= 'a'&& ch<='z')||( ch >= 'A'&& ch<='Z')){
      System.out.println("alphabet");
    }
    else
      System.out.println("not alphabet");
  }
}
