import java.util.Arrays;
import java.util.Scanner;

public class Tinkoff_Pizza {
    public static void main(String[] args) {
        int workersSum, pieces, t = 1;
        Scanner sc =new Scanner(System.in);
        pieces = sc.nextInt();
        workersSum = sc.nextInt();
        int[] workers = new int[workersSum];
        int[] wtest = new int[workersSum];

        for (int i = 0; i < workersSum; i++) {
            workers[i] = sc.nextInt();
            wtest[i] = workers[i];
        }

        while( pieces > 0 ){
            for (int i = 0; i < workersSum & pieces != 0; i++) {
                if (wtest[i] == ( -1 * workers[i]))
                    wtest[i] = workers[i];
                if (workers[i] - 1 == wtest[i])
                    pieces--;
                wtest[i]--;
            }
            t++;
        }
        System.out.println(t);
    }
}
