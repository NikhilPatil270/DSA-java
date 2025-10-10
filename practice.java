import java.util.*;

public class practice {
    static int countEven(int[] nums){
        int count=0;
        for (int num:nums){
            if (num%2==0){
                count++;
            }
        }
        return count;
    }
    static int maxElem(List<Integer> nums){
        int largest=Integer.MIN_VALUE;
        int secondLarg=Integer.MIN_VALUE;
        for (int num:nums){
            if(num>largest){
                secondLarg=largest;
                largest=num;
            } else if (num>secondLarg && num!=largest) {
                secondLarg=num;
            }
        }
        return secondLarg;
    }
    static String uniqueEle(int[] nums){
        Set<Integer> in = new LinkedHashSet<>();
        for (int num:nums){
            in.add(num);
        }
        return String.valueOf(in);
    }
    static int[] twoSum(int[] nums,int tar){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff=tar-nums[i];
            if(map.containsKey(diff)){
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i],i );
        }
        return new int[]{-1,-1};
    }
    static String reverseString(String str){
        char []c=str.toCharArray();
        int i=0;
        int j=c.length-1;
        while (i<j){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;j--;
        }
        return String.valueOf(c);
    }
    static void freqCount(String str){
        Map<Character,Integer>freq=new HashMap<>();
        for(char c:str.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);

        }
        for (Map.Entry<Character,Integer> entry:freq.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    static  String removeDuplicate(String str){
        StringBuilder s=new StringBuilder();
        boolean []seen=new boolean[256];

        for (char c:str.toCharArray()){
            if(!seen[c]){
                seen[c]=true;
                s.append(c);
            }
        }
        return s.toString();

    }

    static  String removeDuplicate2(String str){
        Set<Character> s=new HashSet<>();
        for (char c:str.toCharArray()){
            s.add(c);
        }


        return s.toString();

    }

    static void fibo(int n){
       int a=0;
       int b=1;
        System.out.print(a+" ");
        if (n>1) {
            System.out.print(b+" ");
        }
        for (int i = 2; i < n; i++) {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }

    static boolean isPalNum(int n){
        int org=n;
        int num=0;
        while (n>0){
            int digit=n%10;
            num=num*10+digit;
            n/=10;

        }
        if (org==num){
            return true;
        }
        return false;
    }

    static boolean isPrime(int n){
        if(n<=1) return false;
        for (int i = 2; i <=(int)Math.sqrt(n) ; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    static int sumOfFactors(int n){
        int sum=0;
        if (isPrime(n)){
            return n;
        }
        System.out.print("prime factors= ");
        for (int i = 2; i < n; i++) {
            if(n%i==0 && isPrime(i)){
                System.out.print(i+" ");
                sum+=i;
            }
        }
        System.out.println();
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfFactors(32));

    }
}
