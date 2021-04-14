import java.util.Scanner;

public class Tinkoff_Dominos {
    public static void main(String[] args) {
        byte[] a1 = new byte[2];
        byte[] a2 = new byte[2];

        Scanner sc = new Scanner(System.in);

        a1[0] = sc.nextByte();
        a1[1] = sc.nextByte();
        a2[0] = sc.nextByte();
        a2[1] = sc.nextByte();

        boolean f = false;

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]){
                    f = true;
                    System.out.println(a1[Math.abs(1 - i)] + " " + a1[Math.abs(0 - i)] + " " + a2[Math.abs(0 - j)] + " " + a2[Math.abs(1 - j)]);
                    break;
                }

            }
        }
        if (!f)
            System.out.println("-1");
    }
}
