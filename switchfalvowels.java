write a program to display vowels by using switch fall through in switch case



import java.util.Scanner;
class Sample {
  public static void main(String args[]) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter character");
    char ch=sc.next().charAt(0);
    switch(ch){
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println("vowel");
        break;
      default:
        System.out.println("consonant");
    }
   
   
  }
}