import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row,column;
        System.out.println("Hos Geldiniz ");
        System.out.println("Blok Saysi Giriniz");
       System.out.print("satir sayisi:");
        row = scan.nextInt();
       System.out.print("sutun saysi:");
        column = scan.nextInt();

        MayinTaelasi mayin = new MayinTaelasi(row,column);
        mayin.run();


    }

}
