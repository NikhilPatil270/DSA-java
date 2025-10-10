import java.util.*;

public class StringQues {

    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        s=s.toLowerCase();
        while (i<j){
            char left=s.charAt(i);
            char rigth=s.charAt(j);

            if(!Character.isLetterOrDigit(left)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(rigth)){
                j--;
                continue;
            }
            if(left!=rigth){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int []freq1=new int[26];
        int []freq2=new int[26];
        for(char c:s.toCharArray()){
            freq1[c-'a']++;
        }
        for(char c:t.toCharArray()){
            freq2[c-'a']++;
        }
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }

    public boolean isValid(String s) {

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='('||a=='['||a=='{'){
                stack.push(a);
            }
            else if(stack.empty()) return false;
            else if(a==')' && stack.pop()!='('){
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
        // code here
        StringBuffer str=new StringBuffer();

        for(int i=0;i<s.length();i++){
            if(i==0||s.charAt(i)!=s.charAt(i-1)){
                str.append(s.charAt(i)) ;

            }
        }
        return str.toString();
    }

    public static String longestCommonPrefix(String[] strs){
        if(strs==null||strs.length==0){
            return "";
        }
        String pref=strs[0];
        int prefLen=pref.length();

        for(int i=1;i<strs.length;i++){
            String s=strs[i];
            while(prefLen>s.length()||!pref.equals(s.substring(0,prefLen))){
                prefLen--;
                if(prefLen==0){
                    return "";
                }
                pref=pref.substring(0,prefLen);
            }
        }
        return pref;
    }

    public static String longestCommonPrefix2(String[] strs){
        StringBuilder s=new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        for (int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return s.toString();
            }
            s.append(first.charAt(i));
        }
        return s.toString();
    }

    static String printSequence(String arr[], String input){
        String op="";
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)==' '){
                op=op+"0";
            }else {
                int pos=input.charAt(i)-'A';
                op+=arr[pos];
            }
        }
        return op;
    }

    public static void printDuplicates(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for (char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()>1){
                System.out.println("["+entry.getKey()+":"+entry.getValue()+"]");
            }
        }
    }
    public static void printDuplicates2(String s) {
        char []arr=s.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length;) {
            int count=1;
            while (i+count< arr.length && arr[i]==arr[i+count]){
                count++;
            }
            if (count > 1) {
                System.out.print("['" + arr[i] + "', " + count + "], ");
            }
            i+=count;
        }
    }

    public static void main(String[] args) {
        String [] s={"flower","flow","floght","flop"};
        String str[]
                = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };

        printDuplicates2("geeksforgeeks");
    }
}
