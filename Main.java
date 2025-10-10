import java.util.*;

class A{
    A(){}
    A(int i){
        System.out.println("im a "+i);
    }
}

class B extends A{
    B(){
        System.out.println("im b");
    }
}

class C extends B{
    C(){
        System.out.println("im C");
    }
}
class D extends A{
    D(){
        System.out.println("im D");
    }
}

public class Main {
//    static  int[] twoSum(int [] nums,int target){
//        HashMap<Integer,Integer>map=new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int diff=target-nums[i];
//            if(map.containsKey(diff)){
//                return new int[]{i,map.get(diff)};
//            }
//            map.put(nums[i],i );
//        }
//        return  new int[0];
    //}

     static int countDigitOc(int N,int D){
        int count=0;
        while(N>0){
            if(N%10==D){
                count++;
            }
            N/=10;
        }
        return count;
    }

    static void reverseArray(int arr[],int start,int end){
         if(start>=end){
             return;
         }

         int temp=arr[start];
         arr[start]=arr[end];
         arr[end]=temp;
         reverseArray(arr,start+1,end-1);

    }

    static boolean isAnagram(String a,String b){
         if(a.length()!=b.length()){
             return false;
         }
         char[]arr=a.toCharArray();
         char[]brr=b.toCharArray();
         Arrays.sort(arr);
         Arrays.sort(brr);
         return Arrays.equals(arr,brr);
    }

    static void firstAndLast(int[]a,int n){
         int j=-1;
         int k=-1;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==n) {
                if (j == -1) {
                    j = i + 1;
                }
                k=i+1;
            }

        }
        System.out.println("["+j+","+k+"]");

    }
    static final  int s=1;
    public static void main(String[] args) {
////        int a=countDigitOc(543234,2);
////        System.out.println(a);
//
//        int []arr={1,2,3,4,5,3,4,5,2,2};
////        reverseArray(arr,0, arr.length-1);
////        System.out.println(Arrays.toString(arr));
//
//
////        System.out.println(isAnagram("listen","silent"));
//        firstAndLast(arr,2);
//        int a[]={1,2,3,4,5};
//
//        int num1=Integer.parseInt(args[0]);
//        int num2=Integer.parseInt(args[1]);
//        int sum=num1+num2;
//        System.out.println(sum);

//        String a= new String("hello");
//        String b="hello";
//        if (a==b){
//            System.out.println("true");
//        }else {
//            System.out.println("false");

        String input="java is fun totally";
//        Map<Character,Integer>map=new LinkedHashMap<>();
//        for(char c:input.toCharArray()){
//            map.put(c, map.getOrDefault(c,0)+1);
//        }
//        char res='\0';
//        for (Map.Entry<Character,Integer> entry: map.entrySet()){
//            if (entry.getValue()==1){
//                res=entry.getKey();
//                break;
//            }
//        }
//        if(res == '\0')
//            System.out.println("No non-repetitive character found");
//        else
//            System.out.println("First non-repetitive character: " + res);
//        StringBuilder str=new StringBuilder();
//        for (char c:input.toCharArray()){
//            if(c!=' '){
//                str.append(c);
//            }
//        }
//        System.out.println(String.valueOf(str));

//        int num=12345;
//        int rev=0;
//        while (num>0){
//            int digit=num%10;
//            rev=rev*10+digit;
//            num/=10;
//        }
//        System.out.println(rev);

        int []a={1,3,5,9};
        int []b={2,4,6,7,8};
        int i=0;
        int j=0;
        int k=0;
        int[] merged=new int[a.length+b.length];

        while (i<a.length &&j< b.length){
            if (a[i]<b[j]){
                merged[k++]=a[i++];
            }else
                merged[k++]=b[j++];
        }
        while (i<a.length) merged[k++]=a[i++];
        while (j<b.length) merged[k++]=b[j++];
        System.out.println(Arrays.toString(merged));
    }
}



