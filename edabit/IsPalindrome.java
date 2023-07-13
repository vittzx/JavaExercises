package broCode.edabit;

public class IsPalindrome {
    public static boolean isPalindrome(String s){
        // Create a aux String and pass the String s as parameter 
        StringBuffer aux = new StringBuffer(s);
        // Return a boolean type if s is equals the condition
        // The condition is the revesed aux transformed a String 
        return s.equals(aux.reverse().toString());
    }
    

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam")); // true 
        System.out.println(isPalindrome("adieu")); // false 
        System.out.println(isPalindrome("rotor")); // true

        // String pin = "9823aa";
        // System.out.println(pin.matches("a b c d e f g h i j k l m n o p q s r t u v w x y z "));

        String pin = " 9023";
        System.out.println(pin.contains(" "));

    }
}
