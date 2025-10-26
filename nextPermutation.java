import java.util.Arrays;

public class nextPermutation {

    static void nextPer(int [] arr){
        int ind=-1;
        int n= arr.length;
        //find the break point
        for (int i = n-2; i>=0; i--) {
            if(arr[i]<arr[i+1]){
                ind=i;
                break;
            }
        }
        //if it is in highorder
        if(ind==-1){
            reverse(arr,0);
            return;
        }

        //find the number just greater than ind;
        for (int i =n-1; i>ind; i--) {
            if(arr[i]>arr[ind]){
                swap(arr,ind,i);
            }
        }
        //then reverse rest
        reverse(arr,ind+1);


    }
    static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void reverse(int []arr,int start){
        int end=arr.length-1;
        while (start<end){
            swap(arr, start,end);
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int []arr={2,1,5,4,3,0,0};
        System.out.println(Arrays.toString(arr));
        nextPer(arr);
        System.out.println(Arrays.toString(arr));
    }
}
