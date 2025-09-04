import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int star = 1;

        while(i < n) {
            int val = 1;

            for(int j = 0; j < star; ++j) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }

            ++star;
            ++i;
            System.out.println();
        }

    }
}
