import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        int M,toplam=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        M=inp.nextInt();
        for (int i=1;i<M;i++){
            if (M%i==0){
                toplam+=i;
            }
        }
        if (M==toplam){
            System.out.println(""+M+"  mukemmel sayidir");
        }else{
            System.out.println(""+M+"  mukemmel sayi degildir");
        }
    }
}
