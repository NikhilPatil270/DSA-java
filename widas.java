import java.awt.*;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;


public class widas {

    public static void distintLetters(String str){
        HashSet<Character> s=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            s.add(str.charAt(i));

        }
        System.out.println(s);
        System.out.println(s.size());

    }
    public static int secondLargest(List<Integer> arr){
        if(arr==null || arr.size()<2){
            return Integer.MIN_VALUE;
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            } else if (num>secondLargest && num!=largest) {
                secondLargest=num;
            }
            
        }
        return secondLargest;
    }

    public static void main(String[] args) {
//        String str="abcabc";
//        distintLetters(str);
        List<Integer>l=List.of(10,5,8,20,13);
        int s=secondLargest(l);
        System.out.println(s);
    }
}
