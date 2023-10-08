
// https://leetcode.com/problems/reverse-integer/
import java.lang.Math;
public class ReverseAnInteger {
    public static void main(String[] args) {
        
    }

    public static int reverse(int x){
        // boolean neg = (x > 0)?false: true; 
        // x = Math.abs(x);

        // StringBuffer aux = new StringBuffer(String.valueOf(x)); // convert into a String
        // aux.reverse();

        // if(neg){
        //     aux.insert(0,"-");
        // }
        // x = Integer.parseInt(aux.toString());
        // return x;

        boolean neg = (x > 0) ? false : true; 
        x = Math.abs(x);

        StringBuffer aux = new StringBuffer(String.valueOf(x));
        aux.reverse();

        try {
            int reversed = Integer.parseInt(aux.toString());
            return neg ? -reversed : reversed;
        } catch (NumberFormatException e) {
            return 0;

    }
 }
}
