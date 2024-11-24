package XOgame;

import java.util.Scanner;

public class MyXo {
    private static  char[][] board = new char[3][3];
    private static boolean bool = false;
    private static char winner;
    MyXo(){
        initializeBoard();
        displayBoard();
        theLogic();
    }
    static void initializeBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j< 3; j++){
                board[i][j] = ' ';
            }
        }
    }
    static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j < 2) {
                    System.out.print(board[i][j] + " | ");
                } else System.out.println(board[i][j]);
            }

        }
    }
    static void theLogic(){
        int k = 0;
        int x = 1;
        while (x<=9){
            Scanner sc = new Scanner(System.in);
            if (k%2 == 0){
                System.out.println("Current player: X");
                System.out.println("Give the coordinate of raw and column");
                int row = sc.nextInt();
                int col = sc.nextInt();
                if (board[row][col] == 'X' || board[row][col] == 'O'){
                    System.out.println("Yo what are you doing it's occupied");
                }else {
                    board[row][col] = 'X';
                    x++;
                    k++;
                }
            }else {
                System.out.println("Current player: O");
                System.out.println("Give the coordinate of raw and column");
                int row = sc.nextInt();
                int col = sc.nextInt();
                if (board[row][col] == 'X' || board[row][col] == 'O'){
                    System.out.println("Yo what are you doing it's occupied");
                }else {
                    board[row][col] = 'O';
                    x++;
                    k++; }
            }

            displayBoard();
            getTheWinner();
            if (bool){
                System.out.println("_____________________________________________________________________");
                System.out.printf("||     Congratulation The Winner of The match is %c\n", winner);
                System.out.println("_____________________________________________________________________");
                break;
            }
        }
        if(x > 9){
            System.out.println("_____________________________________________________________________");
            System.out.println("||      Better luck next time smiley face");
            System.out.println("_____________________________________________________________________");
        }
    }
    static void getTheWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                bool = true;
                winner = 'X';
            } else if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                bool = true;
                winner = 'O';
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == 'X' && board[1][j] == 'X' && board[2][j] == 'X') {
                bool = true;
                winner = 'X';
            } else if (board[0][j] == 'O' && board[1][j] == 'O' && board[2][j] == 'O') {
                bool = true;
                winner = 'O';
            }
        }
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            bool = true;
            winner = 'X';
        } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            bool = true;
            winner = 'X';
        }
        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            bool = true;
            winner = 'O';
        } else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            bool = true;
            winner = 'O';
        }
    }




    public static void main(String[] args) {
       new MyXo();
    }
}
