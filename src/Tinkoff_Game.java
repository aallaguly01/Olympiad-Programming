import java.util.Scanner;

public class Tinkoff_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k, max;

        for (int i = 0; i < n; i++) {
            k = 1;
            max = a[i];
            for (int j = i; j < n; j++) {
                if (a[j] > max){
                    max = a[j];
                    k++;
                }
            }
            ans[i] = k;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
