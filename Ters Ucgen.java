import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        int Number;
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        Number = input.nextInt();
        for (int i = (Number - 1); i >= 0; i--) {
            for (int j = 0; j < (Number - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
