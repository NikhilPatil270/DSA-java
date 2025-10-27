import java.util.Arrays;

public class rotateMatrix {
    static void rotateMat(int [][]arr){
        int [][]nums=new int[arr.length][arr[0].length];
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                nums[j][nums.length-1-i]=arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }
    static void optimalRotateMat(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int s=0;
            int e= arr[i].length-1;
            while (s<e){
                int temp=arr[i][s];
                arr[i][s]=arr[i][e];
                arr[i][e]=temp;
                s++;
                e--;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }

    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(arr));
        rotateMat(arr);
        optimalRotateMat(arr);
    }
}
