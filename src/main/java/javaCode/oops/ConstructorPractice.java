package main.java.javaCode.oops;

public class ConstructorPractice {

    // It is called when an instance of the class is created.
    // At the time of calling the constructor, memory for the object is allocated in the memory.

    /*
    * How Java Constructors are Different From Java Methods?
        -> Constructors must have the same name as the class within which it is
           defined it is not necessary for the method in Java.
        -> Constructors do not return any type while method(s) have the return type
           or void if does not return any value.
        -> Constructors are called only once at the time of Object creation while method(s)
           can be called any number of times.
    * */

/*
  ConstructorPractice(){
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        ConstructorPractice constructorPractice = new ConstructorPractice();

    }
   */

}

// Parameterised constructor - If we want to initialize fields of the class with our own values,
// then use a parameterized constructor.
/*

class A{
    private int age=27;
    private String name = "Anurag";

    A(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        A a = new A(25, "Anu");
        System.out.println(a.age + " -- " + a.name);
    }
}

*/

// Copy constructor - It is passed with another object which copies the data available from the passed
// object to the newly created object.

/*
class A{
    int age=27;
    String name = "Anurag";

    A(int age, String name){
        this.age = age;
        this.name = name;
    }

    A(A a){
        this.age = a.age;
        this.name = a.name;
    }

    public static void main(String[] args) {
        A a = new A(25, "Anu");
        System.out.println(a.age + " -- " + a.name);
        A a2 = new A(a);
        System.out.println("Copy constructor");
        System.out.println(a2.age + " -- " + a2.name);
    }
}

*/


