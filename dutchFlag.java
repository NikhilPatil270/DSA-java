public class dutchFlag {
    class Solution {
        public void sortColors(int[] nums) {
            int low=0;
            int mid=0;
            int high=nums.length-1;
            for(int i=0;i<nums.length;i++){
                if(nums[mid]==0){
                    swap(nums,low,mid);
                    mid++;
                    low++;
                }else if(nums[mid]==1){
                    mid++;
                }else{
                    swap(nums,mid,high);
                    high--;
                }
            }
        }
        void swap(int []nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}
