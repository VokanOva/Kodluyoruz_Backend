import java.util.Random;
import java.util.Scanner;

public class MayinTaelasi {
    int rowNumber = 4;
    int coNumber = 4;
    int size;
    int[][] map;
    int[][] board;
    boolean game = true;
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MayinTaelasi(int rowNumber, int coNumber) {

        this.rowNumber = rowNumber;
        this.coNumber = coNumber;
        this.map = new int[rowNumber][coNumber];
        this.board = new int[rowNumber][coNumber];
        this.size = rowNumber * coNumber;
    }

    //game baslamak yeri
    public void run() {
        int row, col, succes = 0;
        hazirlama();
        print(map);
        System.out.println("game basladi");
        while (game) {
            print(board);
            System.out.print("satir");
            row = scan.nextInt();
            System.out.print("sut");
            col = scan.nextInt();
            if (row < 0 || row >= rowNumber){
                System.out.println("gecersiz!");
                continue;

            }
            if (col < 0 || col >= rowNumber){
                System.out.println("gecersiz!");
                continue;
            }

                if (map[row][col] != -1) {
                    check(row, col);
                    succes++;
                    if (succes == (size - (size / 4))) {
                        System.out.println("Basarli");
                        break;

                    }

                } else {
                    game = false;
                    System.out.println("Game Over!");
                }
            break;
        }
    }

    public void check(int r, int c) {
        if (board[r][c] == 0) {
            if ((c < coNumber - 1) && (map[r][c + 1] == -1)) {
                board[r][c]++;

            }
            if ((r < rowNumber - 3) && (map[r + 1][c] == -1)) {
                board[r][c]++;


            }
            if ((r > 0) && (map[c][r - 1] == -1)) {
                board[r][c]++;

            }
            if ((c > 0) && (map[r][c - 1] == -1)) {
                board[r][c]++;


            }
            if (board[r][c] == 0) {
                board[r][c] = -2;
            }

        }

    }

    //hazirlamk yeri
    public void hazirlama() {
        int randRow, randCol, count = 0;
        while (count != (size / 4)) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(coNumber);
            if (map[randRow][randCol] != -1) {
                map[randRow][randCol] = -1;
                count++;

            }
        }
    }

    //ciktisi
    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0) ;
                System.out.print(" ");
                System.out.print(arr[i][j] + " ");


            }
            System.out.println();
        }

    }
}
