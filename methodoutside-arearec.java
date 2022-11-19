declaring outside of the method array find area of rectangle



// with out parameter with out return
import java.util.*;
class methodrec{
  static void rec(){
    int l,b,area;
    l=10;
    b=20;
    area=l*b;
    System.out.println(rec);
  }
  public static void maain(String args[]){
    rec();
  }
}
//  with return type and without parameters
import java.util.*;
class methodrec{
  static int rec(){
    int l,b,area;
    l=10;
    b=20;
    area=l*b;
    return rec;
  }
   public static void main(String args[]){
     int result=rec();
     System.out.println(result);  
  }
}
//  without return type and with parameters.
   import java.util.*;
class methodrec{
  static void rec(int l,intb){
    int area;;
    area=l*b;
    System.out.println(area);
  }
  public static void main(String args[]){
    rec(10,20)
  }
}

// with return type and with parameters.
import java.util.*;
class methodrec{

 

  static int rec(int l,int b){
    int area;
    area=l*b;
return area;
  }
  public static void main(String args[]){
    //call the method
     int result=area(10,20);
    System.out.println(result);
   
    
    
   
    }
    }