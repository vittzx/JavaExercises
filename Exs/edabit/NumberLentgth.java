package broCode.edabit;

public class NumberLentgth{
// length of a number. 10 -> 2 
// 100 -> 3 | 1234 -> 4  
    
    public static int count(int n){
        int count = 0;
        while(n !=0){
            n /= 10;
            count++;
        }
        return count;

    } 

    public static void main(String[] args) {
        System.out.println(count(10));
        System.out.println(count(40));
        System.out.println(count(100));
        System.out.println(count(1000));
        System.out.println(count(-123));
        
    }

    
}