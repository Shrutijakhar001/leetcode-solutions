class Solution {
    public double myPow(double x, int n) {
        long exp=n;
        

        if (exp < 0) {
            exp = -exp;
        }

        double ans = power(x, exp);

        if (n < 0) {
            ans = 1 / ans;
        }

        return ans;
    }

    double power(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
