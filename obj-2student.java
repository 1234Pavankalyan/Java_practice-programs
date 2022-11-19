with out parameter & with out reference



class Student{
  //instance variables
  int rollno;
  String name;
  char grade;
  String branch;
  long mobileno;
//instance methods
void read(){
  System.out.println(name+" reading");
}
void write(){
  System.out.println(name+" Writing"); 
}
  void listen(){
    System.out.println(name+" Listening");
  }
}


class Sample{
  public static void main(String args[]){
    Student std1=new Student();
    std1.rollno=1234;
    std1.name="lalitha";
    std1.grade='A';
    std1.branch="CSE";
    std1.mobileno=986754534l;
    std1.read();
    std1.write();
    std1.listen();
    System.out.println(std1.rollno+" "+std1.name+" "+std1.grade+" "+std1.branch+" "+std1.mobileno);

    Student std2=new Student();
    std2.rollno=234;
    std2.name="anitha";
    std2.grade='B';
    std2.branch="IT";
    std2.mobileno=986784512l;
    std2.read();
    std2.write();
    std2.listen();
    System.out.println(std2.rollno+" "+std2.name+" "+std2.grade+" "+std2.branch+" "+std2.mobileno);
  }   
  }