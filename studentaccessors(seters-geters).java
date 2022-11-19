class Student{
  private int rollno;
  private String name;

 


  //setters are used to assign the value
  void setRollno(int rollno){
    this.rollno=rollno;
  }
  void setName(String name){
    this.name=name;
  }

 

  //getters are used to print the data
  int getRollno(){
    return rollno;
  }
  String getName(){
    return name;
  }
}
class Sample{
  public static void main(String args[]){
    Student st=new Student();
    st.setRollno(1234);
    st.setName("laltha");
    System.out.println(st.getRollno()+" "+st.getName());
  }
}
