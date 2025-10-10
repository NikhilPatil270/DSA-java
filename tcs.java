//Given an array Arr[ ] of N integer numbers. The task is to rewrite the array by putting all multipliers at the end of the given array.
//
//Note : The order of the numbers which are not the multiplier of 10 should remain unaltered ,and similarly the order of the numbers which are the multiplier of 10 should remain unaltered.
//
//For example :
//
//Suppose N =9 and Arr[]={10, 12, 5, 40, 30, 7, 5, 9, 10}
//You have to push all the multiple of 10 at the end of the array Arr[].
//Hence, the output is : 12 5 7 5 9 10 40 30 10



//Question 2
//        Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.
//
//        Note : Keep the first of the array unaltered.
//
//        Example 1:
//
//        5  —Value of N
//        {10, 20, 30, 40, 50}  —Element of Arr[ ]
//        2  —–Value of K
//
//        Output :
//
//        40 50 10 20 30
//
//        Example 2:
//
//        4  —Value of N
//        {10, 20, 30, 40}  —Element of Arr[]
//        1  —–Value of K
//
//        Output :
//
//        40 10 20 30

import java.util.Arrays;

public class tcs {
    static int[] q1(int[]arr){
        int ind=0;
        int []res=new int[arr.length];
        for (int num:arr){
            if(num%10!=0){
                res[ind++]=num;
            }
        }
        for (int num:arr){
            if(num%10==0){
                res[ind++]=num;
            }
        }

        return res;
    }

    public static int[] q2(int []arr,int k){
        int n= arr.length;
        if(k>n){
            k=k-n;
        }
        reverse(arr,0, n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        return arr;
    }
    static void reverse(int []arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70};

        System.out.println(Arrays.toString(q2(arr,9)));

    }
}
