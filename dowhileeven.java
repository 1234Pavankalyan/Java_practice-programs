 write a program by using do while loop to print even numbers

class Sample{
  public static void main(String args[])
  { 
    int i=1;
    do{
      if(i%2==0){
        System.out.println(i);
      }
      i++;
    }while(i<=10);
    }
  }