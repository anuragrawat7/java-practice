package main.java.dsaPractice;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int x = 25;
        System.out.println(sqrtOfX(x));
    }

    static int sqrtOfX(int x) {
        if(x<2)
            return x;
        long start=1;
        long end = x/2;
        while (start <= end){
            long mid = (start+end)/2;
            if (mid*mid > x)
                end = mid-1;
            else
                start = mid + 1;
        }
        return (int) end;
    }
}

    /*
    ----------------------------------------------
    Left and Right Sum Differences
    https://leetcode.com/problems/left-and-right-sum-differences
    public static void main(String[] args) {
        int nums[] = {10,4,8,3};
        System.out.println(Arrays.toString(leftRigthDifference(nums)));
    }

    static int[] leftRigthDifference(int[] nums) {
        int ans[] = new int[nums.length];
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int prefix=0, suffix=0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0){
                prefix += nums[i-1];
            }
            left[i] = prefix;
        }
        for (int j = nums.length-1; j >= 0; j--) {
            if (j + 1 < nums.length){
                suffix += nums[j+1];
            }
            right[j] = suffix;
        }

        for (int m = 0; m < nums.length; m++) {
            ans[m] = Math.abs(left[m] - right[m]);
        }
        return ans;
    }*/

    /*
    -------------------------------------------------
    Number of Good Pairs
    https://leetcode.com/problems/number-of-good-pairs/
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        System.out.println(numIdenticalPairs(arr));
    }
    static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j)
                    ans++;
            }
        }
        return ans;
    }*/

    /*
    ---------------------------------------------------------
        Final Value of Variable After Performing Operations
        https://leetcode.com/problems/final-value-of-variable-after-performing-operations
    public static void main(String[] args) {
        String[] arr = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(arr));
    }

    static public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("++X")){
                x = x + 1;
            }
            else if (operations[i].equals("X++")){
                x = x + 1;
            }
            else if(operations[i].equals("X--")){
                x = x - 1;
            }
            else if(operations[i].equals("--X")){
                x = x - 1;
            }
        }

        return x;
    }*/

    /*
    ------------------------------------
        Shuffle the Array
        https://leetcode.com/problems/shuffle-the-array
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0,j=0; i < n; i++,j+=2) {
            ans[j] = nums[i];
            ans[j+1] = nums[i+n];
        }
        return ans;
    }*/

    /*
    ---------------------------------------

    Build Array from Permutation
    https://leetcode.com/problems/build-array-from-permutation/description/
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(arr));
    }

    static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<nums.length;i++){
            ans[i]= nums[nums[i]];
        }

        return ans;
    }
    */

    //--------------------------------------------
/*
    Concatenate of an array
    https://leetcode.com/problems/concatenation-of-array/description/
public static void main(String[] args) {
        int[] arr = {12, 1, 32};
        System.out.println(Arrays.toString(getConcatenation(arr)));

    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }*/
    //--------------------------------------------------
/*
        Reverse of an array
    public static void main(String[] args) {
        int[] arr = {21, 32, 43, 546, 3456, 1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
//            swap(arr, start, end);
            start++;
            end--;
        }
    }

//    static void swap(int[] arr, int start, int end) {
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//    }*/

}