package thirdTask;

public class Solution {
    public static boolean isPalindrome(String string){
        StringBuilder palindrome = new StringBuilder(string);
        palindrome.reverse();
        return string.contentEquals(palindrome);
    }

    public static void main(String[] args) {
        String palindrome = "kazak";
        String nonPalindrome = "greenAtom";
        System.out.println(Solution.isPalindrome(palindrome));
        System.out.println(Solution.isPalindrome(nonPalindrome));
    }

}
