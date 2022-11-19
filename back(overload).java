2.Create a class to print an integer and a character with two methods having the same name
 but different sequence of the integer and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c), then 
that of the second method will be of the form (char c, int n).


class Print{
  void sample(int n,char c){
    System.out.println(n +" " c)  
  }
  void sample(char c, int n){
    System.out.println(c+" " n)  
  }
}
class  Back{
  public static void main(String args[]){
    Back e=new Back();
    e.sample(10,'c');
    e.sample('c',10);
  }
}