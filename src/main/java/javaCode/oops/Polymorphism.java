package main.java.javaCode.oops;

public class Polymorphism {

    /*
    * Java Polymorphism as the ability of a message to be displayed in more than one form.
    * */

    // Compile time polymorphism - Achieved by function overloading

/*
    public static void abc(int a){
        System.out.println("A - " + a);
    }

    public static void abc(String a){
        System.out.println("A - " + a);
    }

    public static void main(String[] args) {
        abc(1);
        abc("anurag");
    }
*/
}


    // Run time polymorphism
/*
class A1{
    void print(){
        System.out.println("In A1 class");
    }
}

class A2 extends A1{
    void print(){
        System.out.println("In A2 class");
    }
}

class MainClass{
    public static void main(String[] args) {
        A1 a1 = new A2();
        a1.print();
    }
}

*/

// Type of run time polymorphism
// -> Virtual function - It allows an object of a derived class to behave as if it were an object of the base class.
// The derived class can override the virtual function of the base class to provide its own implementation.
