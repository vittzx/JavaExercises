package broCode.hackerRank;

import java.util.List;

public class JumpingClouds {
    public static int jumpingOnClouds(List<Integer> c) {
    int jumps =0;
    for(int i =0; i< c.size() -1;){
        if(i + 2 < c.size() && c.get(i + 2) == 0) i +=2;
        else i++;
        
        jumps++;
    }
    return jumps;
    } 
}
