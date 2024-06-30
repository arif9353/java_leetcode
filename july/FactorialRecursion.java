import java.util.ArrayList;

class Solution {
    long count = 1;
    ArrayList<Long> al = new ArrayList<Long>();

    public ArrayList<Long> factorialNumbers(long n) {
        long ans = factorialReturn(count);
        if (ans <= n) {
            al.add(ans);
            count++;
            factorialNumbers(n); // Recursive call
        }
        return al;
    }

    public long factorialReturn(long x) {
        if (x == 1) {
            return 1;
        }
        return x * factorialReturn(x - 1);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        long n = 6;
        ArrayList<Long> result = sol.factorialNumbers(n);
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
