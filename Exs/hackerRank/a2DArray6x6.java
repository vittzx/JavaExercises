package Exs.hackerRank;

import java.util.List;

// problem: https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays
public class a2DArray6x6 {
    public static int hourglassSum(List<List<Integer>> arr) {
        int max_sum = -63; // 7 * (-9)
        for(int i=0; i <= 3 ; i++){
            for(int j=0; j<= 3;j++){
                int current_sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) // row 0 ,column 0
                 + arr.get(i+1).get(j+1) + // row 1, column 1 
                 arr.get(i+2).get(j) + arr.get(i+2).get(j+1)+ arr.get(i+2).get(j+2); // row 2 , column 2
                 if(current_sum > max_sum){
                    max_sum=current_sum;
                 }
            }
        }
        return max_sum;
    }
}
