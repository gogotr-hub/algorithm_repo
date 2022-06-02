import java.util.Scanner;

public class problem_1100 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ChessBoard ChessBoard = new ChessBoard();

        for(int i=0; i<8; i++){
            ChessBoard.setBoard(s.next(), i);
        }
        System.out.println(ChessBoard.findHorseInWhiteTile());
    }
}

class ChessBoard{
    char[][] board = new char[8][8];

    void setBoard(String row, int rowNum){
        board[rowNum] = row.toCharArray();
    }

    int findHorseInWhiteTile(){
        int totalSum = 0;
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0 && this.board[i][j] == 'F'){
                        totalSum += 1;
                    }
                }else{
                    if(j % 2 == 1 && this.board[i][j] == 'F'){
                        totalSum += 1;
                    }
                }
            }
        }
        return totalSum;
    }
}
