import java.util.Scanner;

public class Tinkoff_GoodName {
    public static void main(String[] args) {
        String words = "aeiouy";
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean f = true;

        if (words.contains(String.valueOf(input.charAt(0))))
            for (int i = 0; i < input.length() - 1; i += 2) {
                if (!words.contains(String.valueOf(input.charAt(i))) | words.contains(String.valueOf(input.charAt(i + 1))))
                    f = false;
            }
        else
            for (int i = 1; i < input.length() - 1; i += 2) {
                if (!words.contains(String.valueOf(input.charAt(i))) | words.contains(String.valueOf(input.charAt(i + 1))))
                    f = false;
            }

        if (f)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
