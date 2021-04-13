import java.util.Scanner;

public class SieveEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] num = new boolean[n + 1];

        for (int i = 2; i < n; i++) {
            if (!num[i]){
                System.out.print(i + ", ");
                for (int j = i + i; j <= n; j+=i) {
                    num[j] = true;
                }
            }
        }
    }
}
