package main.java.dsaPractice;

public class BinaryAddition {
    public static void main(String[] args) {
        String val = addBinary("0101", "0111");
        System.out.println(val);
    }

    /*
    *       CarryOver Result
        0+0     0       0
        0+1     0       1
        1+0     0       1
        1+1     1       0
        1+1+1   1       1
    * */

    public static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(num1 + num2);
    }
}
