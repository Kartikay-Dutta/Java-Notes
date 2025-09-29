package String;

public class string_to_char {
    public static void main(String[] args) {
        String name = "Kartikay";
        char[] letters = name.toCharArray(); //String to char
        System.out.println(letters);

        char[] chars = {'B','o','b'};
        String str = new String(chars); // Char to str
        System.out.println(chars);
    }
}