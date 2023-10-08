package broCode.hackerRank;

public class RepeaTedString {
    public static long repeatedString(String s, long n){
        long times = n / s.length();
        long rest = n % s.length();
        char[] c = s.toCharArray();
        long aws = 0;
    
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aws++;
            }
            // if(c[i] =='a')aws++;
        }
    
        aws *= times;
    
        for (int i = 0; i < rest; i++) {
            if (s.charAt(i) == 'a') {
                aws++;
            }
        }
    
        return aws;
    }   
}


