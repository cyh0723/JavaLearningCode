package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2023/12/4 15:39
 * 合并区间
 */
public class MergeInterval {
    public int[][] merge(int [][] intervals){
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int []> list = new ArrayList<>();
        list.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0]==list.get(list.size()-1)[0]){
                if(intervals[i][1]>list.get(list.size()-1)[1]){
                    list.set(list.size()-1,intervals[i]);
                }

            }else {
                if(intervals[i][0]<=list.get(list.size()-1)[1]){
                    if(intervals[i][1]>=list.get(list.size()-1)[1]){
                        int [] temp=new int[]{list.get(list.size()-1)[0],intervals[i][1]};
                        list.set(list.size()-1,temp);
                    }

                }else {
                    list.add(intervals[i]);
                }
            }

        }
        int[][] array=new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            array[i]=list.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        MergeInterval test=new MergeInterval();
        int[][] nums={{1,4},{4,5}};
        int [][] num=test.merge(nums);
        for (int i = 0; i < num.length; i++) {
            System.out.printf(Arrays.toString(num[i]));
        }
    }
}
