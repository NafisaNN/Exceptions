public class StringIndexDemo {

    public static void main(String[] args) {

        String str = "Hello World";
        try {
            char ch = str.charAt(-1); // Trying to access at negative index
            char ch1 = str.charAt(11); // Trying to access at index equal to size of the string
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("StringIndexOutOfBoundsException caught");
            
        }
    }
}
