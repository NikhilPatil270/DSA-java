import java.util.*;

public class ArrayQues {
    public static void minEle(int []arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min:"+min);
    }

    public static void maxEle(int []arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max: "+max);
    }

    public static void reverseArray(int []arr){
        int i=0;
        int j= arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(map.contains(nums[i])){
                System.out.println(nums[i]);
                return true;
            }
            map.add(nums[i]);
        }
        return false;
    }

    public static int maxSubArray(int[] nums) {
        int res=nums[0];
        int total=0;

        for(int n:nums){
            if(total<0){
                total=0;
            }
            total+=n;
            res=Math.max(res,total);

        }
        return res;
    }

    public static int findmindiff(int []arr,int m){
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for (int i = 0; i+m-1 <arr.length; i++) {
            int diff=arr[i+m-1]-arr[i];
            if(diff<minDiff){
                minDiff=diff;
            }
        }
        return minDiff;

    }
    static int findPivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int arr[],int tar,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (tar<arr[mid]){
                end=mid-1;

            } else if (tar>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static  int search(int[] nums, int target){
        int pivot=findPivot(nums);
        if(pivot==-1){
            return binarySearch(nums,target,0, nums.length-1);

        }
        if (nums[pivot]==target){
            return pivot;
        }
        if(target>nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1, nums.length-1);
    }

    public static int bestTimeToBuySell(int nums[]){
        int min=Integer.MAX_VALUE;
        int profit=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<min){
                min=nums[i];
            } else if (profit<nums[i]-min) {
                profit=nums[i]-min;
            }
        }
        
        return profit;
    }

    public static void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int []nums,int start){
        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0);
            return;
        }
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums,ind,i);
                break;
            }
        }
        reverse(nums,ind+1);
    }

    public static void nextPermutation(int[] nums){
        int i= nums.length-2;
        while (i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j= nums.length-1;
            while (j>=0 && nums[j]<=nums[i])j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }

//find missing and repeated number.
    public  static int[] repeatedNumber(final int[] A) {
        int [] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:A){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int i = 0; i <= A.length; i++) {
            if (map.containsKey(i)){
                if (map.get(i)==2){
                    ans[0]=i;
                }
            }else {
                ans[1]=i;
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int []arr={3,1,2,5,3};
//        minEle(arr);
//        maxEle(arr);
//        reverseArray(arr);
        int []ans=repeatedNumber(arr);
        System.out.println(Arrays.toString(ans));

    }
}
