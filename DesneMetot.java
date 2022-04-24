import java.util.Scanner;

public class Java{

    public static void main(String[] args) {

        int a;

        Scanner input = new Scanner(System.in);

        System.out.print("sayi giriniz : ");

        a = input.nextInt();

        sayi(a);

    }
    static void sayi(int a) {

        sayi(a, 0);

    }

    static int sayi(int a, int toplam) {

        if(a <= 0)

            return result(a, toplam);

        System.out.print(a + " ");

        return sayi(a- 5, ++toplam);
    }

    static int result(int a, int toplam) {

        System.out.print(a + " ");

        if(toplam == 0)

            System.exit(0);

        return result(a + 5, --toplam);
    }
}
