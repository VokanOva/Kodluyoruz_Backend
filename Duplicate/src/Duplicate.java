import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] list = {1,2 ,3 ,4 ,5 ,6 ,7 ,7 ,6 ,5 ,4,3 , 2, 1};

        System.out.print("Repeating and Even Numbers ");


        for (int i = 0; i < list.length; i++){



            for( int j = i+1; j < list.length; j++){



                if ( list[i] == list[j] && list[i] % 2 == 0){



                    System.out.print(list[i] + "  " + list[j] + "  " );

                }


            }
        }
    }


}


