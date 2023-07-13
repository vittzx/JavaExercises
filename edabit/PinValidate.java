package broCode.edabit;

// contains("") if have 
public class PinValidate {
    // https://edabit.com/challenge/sCP58J9vcexchgwo7

    public static boolean validate(String pin){
        if(pin.length() == 6 || pin.length() == 4){
            if(!pin.contains(" ")){
                if(containsOnlyNumber(pin)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsOnlyNumber(String str) {
        return str.matches("[0-9]+");
    }
    public static void main(String[] args) {
        System.out.println(validate("121317")); // true 
        System.out.println(validate("1234")); // true 
        System.out.println(validate("45135")); // false  | 5 digits 
        System.out.println(validate("89abc1")); // false | have a digit
        System.out.println(validate("900876")); // true 
        System.out.println(validate(" 4983")); // false | white space 

    }



    public boolean containsOnlyNumbers(String str) {
    for (char c : str.toCharArray()) {
        if (!Character.isDigit(c)) {
            return false;
        }
    }
    return true;
}
}
