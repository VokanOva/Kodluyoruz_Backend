import java.util.Scanner;

public class Dizi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] list =  {15,12,788,1,-1,-778,2,0};
        int n,sum,sum1=0,sayi = 0;

        System.out.print("Sayi Girin : ");
        n = inp.nextInt();

        for(int i=0;i< list.length;i++){
            sum = n - list[i];

            if(sum < sum1){
                sayi = list[i];
            }
            sum1 = sum;
        }
        System.out.println(sayi);
        sum =0 ; sum1 = 0; sayi = 0;

        for(int i=0;i< list.length;i++){
            sum = list[i] - n;

            if(sum < sum1){
                if(list[i] > n){
                    sayi = list[i];
                }
            }
            sum1 = sum;
        }
        System.out.println(sayi);
    }

}

