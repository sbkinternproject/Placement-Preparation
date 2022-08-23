package Strings;

public class ValidPalidrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is this Palindrome: "+isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        StringBuffer str = new StringBuffer();
        str.append("");
        for(int i = 0 ; i < s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }
//         boolean isLetter(char ch)
// boolean isDigit(char ch)
        System.out.println(str.toString());
        String s1= str.toString();
        boolean flag =false;
        for(int i = 0 ; i < s1.length() / 2 ;i++){
            if(s1.charAt(i) != s1.charAt(s1.length() - i-1)){
                flag = true;
                break;
            }
        }
        return !flag;
    }
}
