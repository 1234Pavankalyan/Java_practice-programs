package bitlabs;

 

public class Welcome {
 
  protected void message() {
    System.out.println("Welcome to bitlabs");
  }
}


class Sample extends Welcome {
  public static void main(String args[]) {
    Sample w = new Sample();
    w.message();

 

  }
}
