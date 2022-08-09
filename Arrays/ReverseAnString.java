package Arrays;

public class ReverseAnString {
    public static void main(String[] args) {
        String str = "Chirag";
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = reverse + str.charAt(str.length() - 1 - i);
        }
        System.out.println(reverse);
    }
}
