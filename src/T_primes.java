/*
https://codeforces.com/problemset/problem/230/B
We know that prime numbers are positive integers that have exactly two distinct positive divisors.
Similarly, we'll call a positive integer t Т-prime, if t has exactly three distinct positive divisors.
You are given an array of n positive integers. For each of them determine whether it is Т-prime or not.
*/

import java.util.Scanner;

public class T_primes {
    public static void main(String[] args) {
        int[] x = new int[1000000 + 1];
        x[1] = 1;
        for (int i = 2; i < Math.sqrt(x.length); i++) {
            for (int j = i + i; j < x.length; j += i) {
                x[j] = 1;
            }
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            double b = Math.sqrt(a);
            if(b == (int)b && x[(int)b] == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
