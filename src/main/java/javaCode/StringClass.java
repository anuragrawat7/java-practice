package main.java.javaCode;

import java.util.*;

public class StringClass {

    /*
     * Strings are the type of objects that can store the character of values and in Java,
     * every character is stored in 16 bits i,e using UTF 16-bit encoding. A
     * string acts the same as an array of characters in Java.
     * */

/*    public static void main(String[] args) {
        String val = "Anurag";
        System.out.println(val.stripIndent());
    }*/


// Incomplete
/*

class Solution {

//    https://leetcode.com/problems/group-anagrams/

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> stringList = Arrays.stream(strs).toList();


        return result;
    }
}
*/

/*
class Solution {

    // https://leetcode.com/problems/valid-anagram/

    public static void main(String[] args) {
        System.out.println(isAnagram("Anu", "una"));

    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] charS= s.toCharArray();
        char[] charT= t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);

        return new String(charS).equals(new String(charT));
    }
}
*/

/*class Solution {

//    https://leetcode.com/problems/goal-parser-interpretation/

    public static void main(String[] args) {
        System.out.println(interpret("(al()lG("));
    }
    public static String interpret(String command) {
//        Approach 1
        return command.replace("()", "o").replace("(al)", "al");

//        Approach 2
        *//*StringBuilder result = new StringBuilder();
        char[] chars = command.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.toString(chars[i]).equals("G"))
                result.append("G");
            else if (Character.toString(chars[i]).equals("(a") && i<chars.length-1 && Character.toString(chars[i+1]).equals("l)")) {
                result.append("al");
                i++;
            }
            else if (Character.toString(chars[i]).equals("(") && i<chars.length-1 && Character.toString(chars[i+1]).equals(")")) {
                result.append("o");
                i++;
            }
        }
        return result.toString();*//*
    }
}*/

/*

class Solution {

    //https://leetcode.com/problems/find-words-containing-character/
    public static void main(String[] args) {
        String[] words = {"aaaaaaaaa","aaaaaaaaa","aaaaaaaaa","aaaaaaaaa"};
        List<Integer> list = findWordsContaining(words, 'a');
        System.out.println(list);
    }

//    Approach 1
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1)
                result.add(i);
        }

        return result;
    }

//    Approach 2
//    public static List<Integer> findWordsContaining(String[] words, char x) {
//        List<String> w = Arrays.stream(words).toList();
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < words.length; i++) {
//            if (words[0].contains(Character.toString(x))){
//                result.add(i);
//            }
//        }
//        return result;
//    }

}
*/

/*class Solution {

    //https://leetcode.com/problems/jewels-and-stones/
    public static void main(String[] args) {
        System.out.println("-- " + numJewelsInStones("aA", "aaAAsfdsf"));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int res=0;
        Set<Character> jewelSet = new HashSet<>();
        for (char jewel: jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        for (char stone: stones.toCharArray()) {
            if (jewelSet.contains(stone))
                res++;
        }

        return res;
    }
}*/

/*
    //https://leetcode.com/problems/defanging-an-ip-address/

    public static void main(String[] args) {
        System.out.println(defangIPaddr("25.23.45.34"));
    }

//    Approach 1
    public static String defangIPaddr(String address) {
        String[] val = address.split("\\.");
        StringBuffer val1 = new StringBuffer();
        for (int i = 0; i < val.length; i++) {
            val1.append(val[i]);
            if (i<val.length-1)
                val1.append("[.]");
        }
        return val1.toString();
    }*/

    //Approach 2
//    public static String defangIPaddr(String address) {
//        return address.replace(".", "[.]");
//    }

}