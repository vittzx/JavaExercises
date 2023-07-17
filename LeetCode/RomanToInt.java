package broCode.LeetCode;

import java.util.HashMap;

// https://leetcode.com/problems/roman-to-integer/
public class RomanToInt{
    public static int romanToInt(String str) {
        // IV = 4 | XL = 40 | CD = 400 
        // IX = 9 | XC = 90 | CM = 900
    
        /*
         * 
            I             1
            V             5
            X             10
            L             50
            C             100
            D             500
            M             1000
         * 
         */
        str = str.replaceAll("IV", "IIII").replaceAll("IX", "IIIIIIIII")
            .replaceAll("XL", "XXXX").replaceAll("XC", "XXXXXXXXX")
            .replaceAll("CD", "CCCC").replaceAll("CM", "CCCCCCCCC");
    
        HashMap<String, Integer> table = new HashMap<String, Integer>();
        table.put("I", 1);
        table.put("V", 5);
        table.put("X", 10);
        table.put("C",100);
        table.put("L", 50);
        table.put("D", 500);
        table.put("M", 1000);
        int aws = 0;
        // for (char c : str.toCharArray()) {
        //     if (str.contains(String.valueOf(c))) {
        //         aws += table.get(String.valueOf(c)); // Convert char to String before getting value
        //     }
        // }
        for (int i = 0; i < str.length(); i++) {
            String currentSymbol = String.valueOf(str.charAt(i));
            if (table.containsKey(currentSymbol)) {
                aws += table.get(currentSymbol);
            }
        }
    
        System.out.println(str);
        return aws;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
