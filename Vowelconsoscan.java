import java.util.scanner;
class Vowelconsoscan  {
  public static void main(String args[]) {
   char ch;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the alphabet");
    ch = sc.next().charAt(0);
    if(( ch == 'a')|| (ch=='e')||( ch =='i')|| (ch=='o')||( ch =='u')){
      System.out.println("alphabet");
    }
    else
      System.out.println("consonant");
  }
}