import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mark = (float)sc.nextInt();
        if (mark > 95.0F) {
            System.out.println("hosiyaar londa h bhai");
        } else if (mark > 85.0F && mark < 95.0F) {
            System.out.println("theek hi h");
        } else {
            System.out.println("gaawar admii h'");
        }

    }
}
