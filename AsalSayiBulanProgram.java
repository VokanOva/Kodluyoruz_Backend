import java.util.Scanner;
public class Patika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int Number = input.nextInt();
        if(isPrime(Number))
            System.out.println(Number + " Sayi Aasaldir ");
        else
            System.out.println(Number + "  Asal degildir !");
    }

    static boolean isPrime(int k) {
        return isPrime(k,3);
    }

    static boolean isPrime(int k, int i) {
        if (k < 2)
            return false;

        if (k % 2 == 0)
            return (k == 2);

        if(i * i > k)
            return true;

        if (k % i == 0)
            return false;

        return isPrime(k,i+2);
    }
}
