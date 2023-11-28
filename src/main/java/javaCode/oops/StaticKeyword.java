package main.java.javaCode.oops;

public class StaticKeyword {

    /*
    * Static keyword mainly used for memory management
    * Static keyword is used to share the same variable and method of a given class
    * It is applicable for:
    *   1. Block
    *   2. Variable
    *   3. Class
    *   4. Method
    *
    * */

    /*
        Cannot access non-static members
        It will give compile time error
    * private int number = 10;

    public static void main(String[] args) {
        System.out.println(number);
    }
    *
    *  */

    /*
    * Static block
    *
    static int a = 10;
    static int b;
    static {
        System.out.println("Inside Static block");
        b = a + 5;
    }

    public static void main(String[] args) {
        System.out.println("A - "+ a);
        System.out.println("b - "+ b);
    }
    *
    * */

    /*
    * Static method
    *  - They can only directly call other static methods.
       - They can only directly access static data.
       - They cannot refer to this or super in any way.
    *
    static int a = 10;
    int b = 5;

    static void a1(){
        a = a + 10;
        b = b + 10;  //Compile time error - non static variable cannot be referenced in static method

        a2(); //Compile time error - non static method cannot be referenced in static method

        System.out.println(super.a); // Compile time error - Cannot use super in a static mehtod
    }

    void a2(){
        System.out.println("A2");
    }

    public static void main(String[] args) {

    }
    * */

    /*
    * Static class - A class can be made static only if it is a nested class.
        static class NestedClass{
        int a = 10;
         public void a(){
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.a();
    }
    * */





}
