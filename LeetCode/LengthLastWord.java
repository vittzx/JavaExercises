class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;
        int lastSpace = s.lastIndexOf(" ");
        return s.substring(lastSpace + 1).length();
    }
}

// problem: https://leetcode.com/problems/length-of-last-word/description/
// level: easy

/* 
        RUN TIME ERROR 
        s = s.trim();
        if(s.length() < 2) return 1;
        StringBuffer aux = new StringBuffer(s);
        aux = aux.reverse();
        int space = aux.toString().indexOf(" ");
        String resp = aux.toString();
        return resp.substring(0,space).length();

*/