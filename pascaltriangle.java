import java.util.ArrayList;
import java.util.List;

public class pascaltriangle {
    static List<Integer> generateRows(int row){
        List<Integer> res=new ArrayList<>();
        res.add(1);
        int ans=1;
        for (int i = 1; i <row; i++) {
            ans=ans*(row-i);
            ans=ans/i;
            res.add(ans);
        }
        return res;
    }
    static void getElement(int n,int r){//nCr
        int ans=1;
        for (int i = 0; i < r; i++) {
            ans*=(n-1);
            ans/=(i+1);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        List<List<Integer>>ans=new ArrayList<>();
        for (int i = 1; i <=5; i++) {
            ans.add(generateRows(i));
        }
        System.out.println(ans);
        getElement(4,4);//pass row-1 and col-1
    }
}
