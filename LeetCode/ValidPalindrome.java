package broCode.LeetCode;

public class ValidPalindrome {
    public static boolean validPalindrome(String s){
        s = s.toLowerCase().trim().replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]","").replaceAll(" ","");;
        
        StringBuffer aws = new StringBuffer(s);
        if(aws.reverse().toString().equals(s)){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        validPalindrome("race a car");
        validPalindrome("A man, a plan, a canal: Panama");
    }
}
