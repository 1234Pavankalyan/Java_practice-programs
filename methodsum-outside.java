declaring out side of main method 


 // with out parameter with out return

import java.util.*;
class Sample{

 

  static void sum(){
    int a,b,sum;
    a=10;
    b=20;
    sum=a+b;
    System.out.println(sum);
  }
  public static void main(String args[]){
    //call the method
    sum();
    
   
    }
    }


//  with return type and without parameters.

import java.util.*;
class Sample{

 

  static int sum(){
    int a,b,sum;
    a=10;
    b=20;
    sum=a+b;
   return sum;
  }
  public static void main(String args[]){
    //call the method
  int result=sum();
    System.out.println(result);
    
    
   
    }
    }

//  without return type and with parameters.

import java.util.*;
class Sample{

 

  static void sum1(int a,int b){
    int sum;
    sum=a+b;
    System.out.println(sum);  
  }
  public static void main(String args[]){
    //call the method
     sum1(10,20);
   

// with return type and with parameters.

import java.util.*;
class Sample{

 

  static int sum1(int a,int b){
    int sum;
    sum=a+b;
return sum;
  }
  public static void main(String args[]){
    //call the method
     int result=sum1(10,20);
    System.out.println(result);

    }
    }
