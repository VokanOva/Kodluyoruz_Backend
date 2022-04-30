public class Main {

    static boolean isFind(int[] list, int value) {
        for (int i : list) {
            if (i == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] Tekrar = new int[array.length];

        int a = 0, k = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if ((array[i] == array[j])) {

                    a++;
                }

            }

            if (isFind(Tekrar, array[i]) == false) {

                Tekrar[k++] = array[i];

                System.out.println(array[i] + " sayi " + a + " kere tekrarlendi.");

            }

            a = 0;

        }
    }
}