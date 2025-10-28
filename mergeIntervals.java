import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> ans=new ArrayList<>();
        int []prev=intervals[0];
        for (int i = 0; i < intervals.length; i++) {
            int []interval=intervals[i];
            if(interval[0]<=prev[1]){
                prev[1]=Math.max(interval[1],prev[1]);
            }else{
                ans.add(prev);
                prev=interval;
            }
        }
        ans.add(prev);
        return ans.toArray(new int[ans.size()][]);
    }

    public static List<List<Integer>> mergeList(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<List<Integer>> ans=new ArrayList<>();
        int []prev=intervals[0];
        for (int i = 0; i < intervals.length; i++) {
            int []interval=intervals[i];
            if(interval[0]<=prev[1]){
                prev[1]=Math.max(interval[1],prev[1]);
            }else{
                ans.add(Arrays.asList(prev[0],prev[1]));
                prev=interval;
            }
        }
        ans.add(Arrays.asList(prev[0],prev[1]));
        return ans;
    }




    public static void main(String[] args) {
        int [][]arr={{15,18},{2,6},{1,3},{8,10}};
//        System.out.println(Arrays.deepToString(merge(arr)));

//        Arrays.sort(arr,(a,b)->{
//            if (a[0]!=b[0])
//                    return a[0]-b[0];
//            return a[1]-b[1];
//        });

        System.out.println(Arrays.deepToString(arr));
        System.out.println(mergeList(arr));
    }

}
