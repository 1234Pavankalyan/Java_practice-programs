//Hyericheal Inheritance


class Animal{
  String color;
  int no_legs;
  String bread;
  void eat(){
    System.out.println("eating");
  }  
  void run(){
    System.out.println("running");
  }
}
class Dog extends Animal{
  void bark(){
    System.out.println("Bow Bow......");
  }
  
}
class Cat extends Animal{
  String eyecolor;
  void meow(){
    System.out.println("Meow meow......");
  }

  void display(){
    System.out.println(color +" "+no_legs+" "+bread +" "+ eyecolor);  }
  
}

class Sample{
  public static void main(String args[]){
    Animal puppy=new Animal();
    puppy.color="black";
    puppy.no_legs=4;
    puppy.bread="jarman shepherd";
    puppy.eyecolor="blue";
    puppy.display();
    puppy.eat();
    puppy.run();
    puppy.meow();
  }
}