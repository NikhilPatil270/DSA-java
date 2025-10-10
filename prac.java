import java.util.*;

public class prac {

    static int largest(int []nums){
        int target=0;
        int sum=nums[0];
        for (int n:nums){
            if(target<0){
                target=0;
            }
            target+=n;
            sum=Math.max(sum,target);
        }
        return sum;
    }

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set=new HashSet<>();
        for (int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static int maxProfit(int[] prices){
        int min=Integer.MAX_VALUE;
        int profit=0;
        for (int i = 0; i < prices.length; i++) {
            if(min>prices[i]){
                min=prices[i];
            }
            if(profit<prices[i]-min){
                profit=prices[i]-min;
            }
        }
        return profit;
    }

    public static int[] productExceptSelf(int[] nums){
        int n= nums.length;
        int []l=new int[n];
        int []r=new int[n];
        int []res=new int[n];
        l[0]=1;
        for (int i=1;i<n;i++){
            l[i]=l[i-1]*nums[i-1];
        }
        r[n-1]=1;
        for (int i=n-2;i>=0;i--){
            r[i]=r[i+1]*nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            res[i]=l[i]*r[i];

        }
        return res;
    }
    static int kthLargest(int []nums,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int num:nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    static int[] twoSum(int[] nums,int tar){
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff=tar-nums[i];
            if(map.containsKey(diff)){
                return new int[]{i,map.get(diff)};
            }
            map.put(nums[i],i );
        }
        return new int[]{-1,-1};
    }

    static void freqCount(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value:"+entry.getValue());
        }
    }
    static  String removeDuplicate(String str){
        StringBuilder sb=new StringBuilder();
        boolean []seen=new boolean[256];
        for (char c:str.toCharArray()){
            if(!seen[c]){
                seen[c]=true;
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static boolean isPalNum(int n){//1234
        int org=n;
        int num=0;
        while (n>0){
            int digit=n%10;
            num=num*10+digit;
            n/=10;
        }
        if(org==num){
            return true;
        }
        return false;
    }

    static boolean isPrime(int num){
        if (num<=1) return false;
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if(num%i==0) return false;
        }
        return true;
    }

    static int sumOfFactors(int n){
        int sum=0;
        if(isPrime(n)){
            return n;
        }
        System.out.print("FActors: ");
        for (int i = 2; i <n; i++) {
            if(isPrime(i) && n%i==0){
                sum+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        return sum;
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        s=s.toLowerCase();
        while (i<j){
            char left=s.charAt(i);
            char right=s.charAt(j);
            if(!Character.isLetterOrDigit(left)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                j--;
                continue;
            }
            if(left!=right){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        int []f1=new int[26];
        int []f2=new int[26];
        for (char c:s.toCharArray()){
            f1[c-'a']++;
        }for (char c:t.toCharArray()){
            f2[c-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(f1[i]!=f2[i]){
                return false;
            }
        }
        return true;
    }


    public  static boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char a=s.charAt(i);
            if(a=='('||a=='['||a=='{'){
                stack.push(a);
            } else if (stack.isEmpty()) {
                return false;
            } else if (a==')' && stack.pop()!='(') {
                return false;
            }
            else if(a==']' && stack.pop()!='['){
                return false;
            }
            else if(a=='}' && stack.pop()!='{'){
                return false;
            }

        }
        return stack.empty();
    }


    public static  String removeConsecutiveCharacter(String s) {
        StringBuffer str=new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if(i==0|| s.charAt(i)!=s.charAt(i-1)){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static String longestCommonPrefix2(String[] strs){
        StringBuilder str=new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0];
        String sec=strs[strs.length-1];
        for (int i = 0; i < Math.min(first.length(),sec.length()); i++) {
            if(first.charAt(i)!=sec.charAt(i)){
                return str.toString();
            }
            str.append(first.charAt(i));
        }
        return str.toString();
    }




        public static void main(String[] args) {
        int []arr={4,1,2,3,4,5};
//        System.out.println(Arrays.toString(twoSum(arr,3)));
        System.out.println(removeConsecutiveCharacter("niiiikkkkkkkhiiiiiiiiiiillllllllllll"));
    }
}
