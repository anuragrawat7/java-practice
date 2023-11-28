package main.java.javaCode;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int r=0, sum=0, temp=x;
        while(x>0){
            r = x % 10;
            sum = (sum*10)+r;
            x=x/10;
            System.out.println("R - " + r + "| Sum - " + sum + "| X - " + x );
        }
        return temp == sum;
    }
}
