

public class Task_price {

    static int col = 4 , row = 4 -1, n = 76;
    static int[][] a = {{111, 42, 13, 1},
            {222, 77, 11, 10},
            {333, 103, 10, 50},
            {444, 65, 12, 5}};

//    static int[][] a = {{111, 42, 9, 1},
//            {222, 77, 11, 10},
//            {333, 103, 10, 50},
//            {444, 65, 12, 5}};

//    static int[][] a = {{111, 100, 30, 1},
//            {222, 60, 11, 10},
//            {333, 100, 13, 50}};

    public static void main(String[] args) {
        sort();
        solve();
    }

    public static void solve(){
        int[] d = new int[n + 1];
        int[][] p = new int[n + 1][2];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < col; j++) {
                if(i - a[j][3] >= 0){
                    if(p[i - 1][0] == a[j][3]){
                        if (a[j][1] - d[i - 1] * a[j][3] >= 0){
                            d[i] = d[i - a[j][3]] + 1;
                            p[i][0] = a[j][3];
                            p[i][1] = a[j][0];
                            break;
                        }
                    } else if(a[j][1] - d[i - 1] >= 0){
                        d[i] = d[i - a[j][3]] + 1;
                        p[i][0] = a[j][3];
                        p[i][1] = a[j][0];
                        break;
                    }
                }
            }
        }

        if (d[n] != 0){
            printSum(n, p);
        }
    }

    static void printSum(int i, int[][] p) {
        if (i == 0)
            return;
        printSum(i - p[i][0], p);

        if (i - p[i][0] > 0)
            System.out.print("; ");
        System.out.print("{" + p[i][1] + ", " + p[i][0] + "}");
    }

    public static void sort(){
        for (int i = 0; i < col - 1; i++) {
            for (int j = i + 1; j < col; j++) {
                if (a[i][2] > a[j][2]){
                    int[] c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
    }

}
