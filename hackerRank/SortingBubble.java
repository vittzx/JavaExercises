package broCode.hackerRank;

// problem: https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
// level: Easy;
public class SortingBubble{
    public static void countSwaps(List<Integer> a) {
        int n = a.size();
        int swaps =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j+1)) {
                    int temp = a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1, temp);
                    swaps++;
                }
            }
        
        }
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size()-1));
              
    }
}