import java.lang.reflect.Array;
import java.util.Arrays;

public class ship {
    public static int rounds(int cap,int people){

        int dummy=people/cap;
        if(people % cap!=0){
            return dummy+1;
        }

        return  dummy;
    }
    public static int pattern(int n){
        if(n==0){
            return 0;
        }
        int sum=0;
        int rowsum=0;
        for (int i = 1; i < n+1; i++) {
            if(i==1){
                rowsum=1;
            }else {
                rowsum=(2*((i*(i+1))/2))-1;
            }

            sum+=rowsum;
        }
        return sum;

    }
    public static void printPattern(int n){


        for (int i = 1; i <=n; i++) {
            for (int s = 1; s <= n-i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static int minArrSum(int []arr,int n){
        Arrays.sort(arr);
        int m1=arr[n-1];
        int sum=0;
        int m2=arr[n-2];
        double avg=(m1+m2)/2.0;
        for (int num:arr){
            if(num>=avg){
                sum+=num;
            }
        }
        return sum;
    }
    public static int[] maxProductSum(int []arr,int tar){
        int [] res=new int[2];
        int n=arr.length;
        int maxProduct=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                int sum=arr[i]+arr[j];
                if(tar==sum){
                    int product=arr[i]*arr[j];
                    if(product>maxProduct){
                        maxProduct=product;
                        if(arr[i]>arr[j]){
                            res[0]=arr[i];
                            res[1]=arr[j];
                        }else {
                            res[0]=arr[j];
                            res[1]=arr[i];
                        }
                    }
                }
            }
        }
        return res;
    }
    public static int tripletCount(int []arr){
        int n=arr.length;
        int count=0;
        for (int i = 0; i < n-2; i++) {
            if(arr[i]+arr[i+2]==arr[i+1]){
                count++;
            }
        }
        return  count;
    }


    public static int getMinCost(String s1,String s2){
        int []f1=new int[26];
        int []f2=new int[26];

        for (char c:s1.toCharArray()){
            f1[c-'A']++;
        }
        for (char c:s2.toCharArray()){
            f2[c-'A']++;
        }
        int cost=0;
        for (int i = 0; i < 26; i++) {
            if(f2[i]>f1[i]){
                cost+=(f2[i]-f1[i]);
            }
        }
        return cost;
    }

    public static void main(String[] args) {

        System.out.println(getMinCost("ABCD","ASDFGHJJJ"));
    }
}
