public class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return power(x, N);
    }

    private double power(double x, long n) {
        if (n == 0) return 1.0;
        double half = power(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.myPow(2.0, 10));    
        System.out.println(sol.myPow(2.1, 3));     
        System.out.println(sol.myPow(2.0, -2));
    }
}