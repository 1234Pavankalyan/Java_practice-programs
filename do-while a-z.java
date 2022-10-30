 write a program to print from A to Z by using  DO-WHILE loop

class AtoZ{
  public static void main(String args[]){
    char c='A';
    do{
      System.out.println(c);
      c++;
    }while(c<='Z');
  }
}