package Exs.hackerRank;

import java.util.List;
// problem: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays
public class LeftRotation {
        public static List<Integer> rotLeft(List<Integer> a, int d) {
    d =  d % a.size();
    rotate(a, 0, a.size() - 1);
    rotate(a, 0, a.size() - d - 1);
    rotate(a, a.size() - d, a.size() - 1);
    

    return a;
    }
    public static void rotate(List<Integer> a, int start, int end){
        while(end> start){
            // a.set(int index, int element)
            int aux = a.get(start);
            a.set(start, a.get(end));
            a.set(end, aux);
            end--;
            start++;
        }
    }

}
