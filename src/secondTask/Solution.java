package secondTask;

public class Solution {

    public static void replace(int a, int b){
        a +=b;
        b = a -b;
        a -=b;
        System.out.println("a - "+ a + ", b - " + b);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        Solution.replace(a,b);
    }
}
