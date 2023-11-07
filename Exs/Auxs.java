package Exs;

public class Auxs {
    public static void main(String[] args) {
        // System.out.println(101-72);
        char letter = 'A';
        int asciiValue = (int) letter;
        // System.out.println("ASCII value of " + letter + " is " + asciiValue);

        String str = "JAVA";
        char[] aux = new char[str.length()];
        aux = str.toCharArray();

        // System.out.println((int) aux[1]);

        int[] nums = new int[5];
        for(int i =0; i < nums.length; i++){
            nums[i] = i;
        }
    
        // System.out.println(java.util.Arrays.toString(nums));

        char auxs = 72;
        String j = String.valueOf(auxs);
        System.out.println(j);


        String auxa = "wwasd";
        auxa = auxa + "asdjka" ;
        System.out.println(auxa.contains("w"));

        String path = "/home/";
    }
}
