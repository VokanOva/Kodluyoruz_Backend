import java.util.Scanner;

 public class patica {
    public static void main(String[] args) {

        int year;

        Scanner scan = new Scanner(System.in);

        System.out.print("Luften yil girin :");
        year = scan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println(year + " bir artik yıl degildir.");
            } else {
                System.out.println(year + " artik bir yildir.");
            }

        } else {

            System.out.println(year + " bir artik yildir degildir.");
        }
    }
}
