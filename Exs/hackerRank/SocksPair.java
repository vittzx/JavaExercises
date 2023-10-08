package broCode.hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocksPair {
    // problem:  https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup

    
    public static int sockMerchant(int n, List<Integer> ar) {
    List<Integer> indexUses = new ArrayList<Integer>();
    int aws =0;
    for(int i =0; i< n - 1; i++){
        if(!indexUses.contains(ar.get(i))){
            indexUses.add(ar.get(i));
            aws +=  Collections.frequency(ar, ar.get(i)) / 2;

        }
    }
    return aws;

    }

}
