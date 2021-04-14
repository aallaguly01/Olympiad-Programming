import java.util.Scanner;

public class Tinkoff_Time {
    public static void main(String[] args) {
        int a, b, c, t;
        int a1 = 0, b1 = 0, c1 = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        t = sc.nextInt();

        while (t > 0){
            if (t - c >= 0) {
                b1++;
                t -= c;
            }
            else{
                c1 = t;
                t = 0;
            }

            if (b1 == b){
                a1++;
                if (a1 == a){
                    a1 = 0;
                    b1 = 0;
                    c1 = 0;
                } else
                    b1 = 0;
            }
        }

        System.out.println(a1 + " " + b1 + " " + c1);
    }
}
