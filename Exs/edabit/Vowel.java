package broCode.edabit;

// Vowel Family - Exercise 
// https://edabit.com/challenge/9P6yDuSZxYTihMtT6

import java.util.Arrays;

public class Vowel {
    public static String[] sameVowelGroup(String[] words){


        boolean contemA= false, contemE = false, contemI = false, contemO = false, contemU = false;
        int len =0;


        contemA = (words[0].contains("a")) ? true : false;
        contemE = (words[0].contains("e")) ? true : false;
        contemI = (words[0].contains("i")) ? true : false;
        contemO = (words[0].contains("o")) ? true : false;
        contemU = (words[0].contains("u")) ? true : false;

        for(int i =0; i < words.length; i++){

            if(words[i].contains("a") == contemA &&
            words[i].contains("e") == contemE &&
            words[i].contains("i") == contemI &&
            words[i].contains("o") == contemO &&
            words[i].contains("u") == contemU){
                len++;
            }
        }

        String[] aws = new String[len];
        int j =0;

        for(int i =0; i < words.length; i++){
            if(words[i].contains("a") == contemA &&
            words[i].contains("e") == contemE &&
            words[i].contains("i") == contemI &&
            words[i].contains("o") == contemO &&
            words[i].contains("u") == contemU){
                aws[j] = words[i];
                j++;
            }
        }
        // System.out.println("Contem A: " + contemA);
        // System.out.println("Contem E: " + contemE);
        // System.out.println("Contem I: " + contemI);
        // System.out.println("Contem O: " + contemO);
        // System.out.println("Contem U: " + contemU);
        return aws;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sameVowelGroup(new String[]{"toe", "ocelot", "maniac"}))); // toe, ocelot
        System.out.println(Arrays.toString(sameVowelGroup(new String[]{"many", "carriage", "emit", "apricot", "animal"}))); // many 
        System.out.println(Arrays.toString(sameVowelGroup(new String[] {"hoops", "chuff", "bot", "bottom"}))); // "hoops", "bot", "bottom"
        System.out.println(Arrays.toString(sameVowelGroup(new String[]{"crop", "nomnom", "bolo", "yodeller"}))); // "crop", "nomnom", "bolo"

    }
}
