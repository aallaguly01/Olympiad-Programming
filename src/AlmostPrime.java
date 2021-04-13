/*
  https://codeforces.com/problemset/problem/26/A
  A number is called almost prime if it has exactly two distinct prime divisors.
  For example, numbers 6, 18, 24 are almost prime, while 4, 8, 9, 42 are not.
  Find the amount of almost prime numbers which are between 1 and n, inclusive
*/

import java.util.Scanner;

public class AlmostPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        int n = sc.nextInt();

        boolean[] num = new boolean[n];

        for (int i = 2; i <= n / 2; i++) {
            if (!num[i]) {
                for (int j = i + i; j < n; j+=i) {
                    num[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            int p =  0;
            for (int j = i - 1; j >= 2; j--) {
                if (i % j == 0 & !num[j])
                    p++;
                }
            if (p == 2)
                k++;
        }

        System.out.println(k);

    }
}
