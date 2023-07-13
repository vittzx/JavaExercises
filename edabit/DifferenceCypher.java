package broCode.edabit;

import java.util.Arrays;
// The Problem
// https://edabit.com/challenge/KZrmicjc8zCZyGNee
public class DifferenceCypher {
    public static int[] encripty(String str){
        int[] aws = new int[str.length()];
        char[] aux = new char[str.length()];
        aux = str.toCharArray();

        for(int i =0; i < str.length(); i++){
            if(aws[0] == 0){
                aws[0] = (int) aux[0];
            }
            else if(aws[i] == 0){
                aws[i] = (int) ((int) aux[i]- aux[i-1]);            
            }
        }
        return aws;
    }

    public static String decrypt(int[] arr){
        StringBuffer aws = new StringBuffer(); 
        for(int i =0; i < arr.length ; i++){
            if(i == 0){
                char aux  = (char) arr[0];
                String aux2 = String.valueOf(aux);
                aws.append(aux2);
            }
            else if(arr[i] > 0){ 
                char aux = (char)(arr[i] + arr[i-1]);
                String aux2 = String.valueOf(aux);
                aws.append(aux2);
            }
            else if(arr[i] < 0){
                char aux = (char)(-arr[i] + arr[i]);
            }
        }

        return aws.toString();
    }

    public static void main(String[] args) {
        // Use the Arrays.toString only to see the result, because when run with System.out.println he returns this: [I@2a139a55.
        System.out.println(Arrays.toString(encripty("Hello")));
        System.out.println(Arrays.toString(encripty("Sunshine")));
        System.out.println(Arrays.toString(encripty("Hello")));
    
    }
}