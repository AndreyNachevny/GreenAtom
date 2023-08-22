package secondTask;

public class Solution {

    public void replace(int a, int b){
        a +=b;
        b = a -b;
        a -=b;
        System.out.println("a - "+ a + ", b - " + b);
    }
}
