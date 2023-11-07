package Exs;

// String Builder is thread Safer and String Builder isnt
// String Buffer 
public class StringB {
    public static void main(String[] args) {
        String a = "a"; 
        StringBuffer sb = new StringBuffer(a); // CAN PASS A STRING INSIDE THE STRINGBUFFER AS PARAMETER
        sb.append(" b"); // append to String Buffer
        sb.deleteCharAt(1); // Delete by index 
        sb.length(); // return the lenght 
        sb.capacity(); // return the memory capacity of the String Buffer 
        sb.insert(0," Roberto Carlos "); // Pass the index to add a String passed as parameter 
        sb.setLength(0);
        String b = sb.reverse().toString(); // Convert sb to String 
        // sb.reverse() -> reverse a String 
        System.out.println(b);
        
    }
}
