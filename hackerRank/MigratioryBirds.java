import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    // problem: https://www.hackerrank.com/challenges/migratory-bird
    // level: easy

    public static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> aws = new HashMap<>();
        aws.put(1,0);aws.put(2,0);aws.put(3,0);aws.put(4,0);aws.put(5,0);
        int resp= 0;
        int count =0;
        for(int num: arr){
            aws.merge(num, 1, Integer::sum);
        }
        for(int num: aws.keySet()){
            if(aws.get(num) > count){
                count = aws.get(num);
                resp = num;
            }
        }
        return resp;

    }

}