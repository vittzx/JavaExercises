package broCode.hackerRank;

// problem: https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=SortingBubble
// difficulty : easy

import java.io.*;

public class MarkAndToys{
    public static int maximumToys(List<Integer> prices, int k) {
        int count =0;
        Collections.sort(prices);
        int money = k;
        for(int i =0; i < prices.size(); i++){
            if(money >= prices.get(i)){
                money -= prices.get(i);
                count++;
            }
            else if(money < prices.get(i)) return count;
        }
        return 0;
    }
}