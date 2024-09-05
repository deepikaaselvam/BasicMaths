package MyApproaches;

public class ConsecutiveIntegerGCD {
    public static void main(String[] args) {
        int m = 60, n = 24;
        int ans = 0, value = 0, answer = 0;
        int t = Math.min(m, n);
        while (m % t != 0) {
            ans = m / t;
            t = t - 1;
            value = t;
        }
        int finaleyy = value;
        while (n % finaleyy != 0) {
            answer = n / finaleyy;
            t = t - 1;
        }
        System.out.println(t);

    }
}
