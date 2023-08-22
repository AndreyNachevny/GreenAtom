package thirdTask;

public class Solution {
    public boolean isPalindrome(String string){
        StringBuilder palindrome = new StringBuilder(string);
        palindrome.reverse();
        return string.contentEquals(palindrome);
    }
}
