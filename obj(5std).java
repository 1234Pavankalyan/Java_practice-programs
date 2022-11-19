enter the 5student details by using for loop with object

import java.util.*;
class Student{
  int rollno;
  String name;
  int marks;
  String branch;
  long mobileno;
  char grade;
}
class Student1{
  public static void main(String args[]){
    Student s[]=new student();
    for (int i=0;i<5;i++){
      s[i]=new Student();
      System.out.println("enter the student "+i+" details ");
      System.out.println("enter the roll no");
      s[i].rollno=sc.nextInt();
      System.out.println("enter the name");
     s[i].name=sc.next();
    System.out.println("enter the marks");
     s[i].marks=sc.nextInt();
      System.out.println("enter the branch");
     s[i].branch=sc.next();
      System.out.println("enter the mobileno");
      s[i].mobileno=sc.nextlong();
      System.out.println("enter the grade");
      s[i].gradeno=sc.next().charAt(0);
    }
    for(int i=0;i<5;i++){
      System.out.println(s[i].student+" "+s[i].name+" "+s[i].branch+" "+s[i].marks+" "+st[i].grade+" "+s[i].mobileno+" "+) ;
    }
  }
}