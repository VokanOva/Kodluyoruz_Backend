import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        int k;

        Scanner input = new Scanner(System.in);

        System.out.print(" Sayi Girin:");
        k = input.nextInt();

        for (int i= 1; i <= k; ) {
            i++;
            if (i % 4 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
