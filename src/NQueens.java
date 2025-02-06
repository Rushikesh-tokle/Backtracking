public class NQueens {
    public static void nQueens(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
        }
   for(int j=0;j< board.length;j++){
       board[row][j]='Q';
       nQueens(board,row+1);
       board[row][j]='X';
   }
    }
    public static void printBoard(char board[][]){

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("____");

    }
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nQueens(board,0);

    }
}
