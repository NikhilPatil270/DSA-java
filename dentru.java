import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class dentru {
//MAXIMUM SUBARRAY
    static int largestSum(int [] arr){
        int sum=arr[0];
        int target=0;
        for(int n:arr){
            if(target<0){
                target=0;
            }
            target+=n;
            sum=Math.max(target,sum);
        }
        return sum;
    }
//CONTAINS DUPLICATE
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set=new HashSet<>();
        for (int n:nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }

    //BEST TIME TO BUY AND SELL STOCK
    public static int maxProfit(int[] prices){
        int min=Integer.MAX_VALUE;
        int profit=0;
        for (int i = 0; i < prices.length; i++) {
            if(min>prices[i]){
                min=prices[i];
            }
            else if(profit<prices[i]-min){
                profit=prices[i]-min;
            }
        }

        return profit;
    }
//product of array EXCEPT ITSELF
    public static int[] productExceptSelf(int[] nums){
        int n= nums.length;
        int []l=new int[n];
        int []r=new int[n];
        int []res=new int[n];

        l[0]=1;
        for (int i = 1; i <n ; i++) {
            l[i]=l[i-1]*nums[i-1];
        }
        r[n-1]=1;
        for (int i = n-2; i>=0 ; i--) {
            r[i]=r[i+1]*nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            res[i]=l[i]*r[i];
        }
        return res;
    }

    static int kthLargest(int []nums,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();//[3,2,1,5,6,4]->
        for (int num:nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    //search in rotated array
    static int findPivot(int []arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return  mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else {
                start=mid+1;
            }

        }
        return -1;
    }

    static int binarySeacrh (int []arr,int tar,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<tar){
                start=mid+1;
            } else if (arr[mid]>tar) {
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int search(int arr[],int tar){
        int pivot=findPivot(arr);
        if(pivot==-1){
            return binarySeacrh(arr,tar,0,arr.length-1);
        }
        if(arr[pivot]==tar){
            return pivot;
        }
        if(tar>arr[0]){
            return binarySeacrh(arr,tar,0,pivot-1);
        }
        return binarySeacrh(arr,tar,pivot+1,arr.length-1);
    }

    public static void main(String[] args) {
        int [] nums={4,5,6,7,8,9,1,2,3};
        System.out.println(search(nums,3));
    }
}
