
// problem:  https://leetcode.com/problems/longest-palindromic-substring/


public class LongestPalindromicSubstring {
    // 73/ 141
    public String longestPalindrom(String s) {
        int left = 0;
        int right = s.length();
        while(right > left){
            String aux = s.substring(left,right);
            StringBuffer resp = new StringBuffer(aux);
            if(resp.reverse().toString().equals(aux)) return resp.toString();
            else{
                left++;
                right--;
            }
        }

        left = 0;
        right = s.length();

        while(right > left){
            String aux = s.substring(left,right);
            StringBuffer resp = new StringBuffer(aux);
            if(resp.reverse().toString().equals(aux)) return resp.toString();
            else{
                left++;
            }
        }

        left = 0;
        right = s.length();

        while(right > left){
            String aux = s.substring(left,right);
            StringBuffer resp = new StringBuffer(aux);
            if(resp.reverse().toString().equals(aux)) return resp.toString();
            else{
                right--;
            }
        }
        return "";

    }
}
