package Exs.hackerRank;

import java.util.Collections;
import java.util.List;

public class MinDifference {
        public static int minimumAbsoluteDifference(List<Integer> arr) {
        Collections.sort(arr);
        int min_difference = Integer.MAX_VALUE;
        for(int i =0; i < arr.size() -1 ; i++){
            int current_value = Math.abs(arr.get(i) - arr.get(i+ 1));
            if(current_value < min_difference) min_difference = current_value;
            
        }
        return min_difference;
    }
}
