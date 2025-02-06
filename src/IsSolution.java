public class IsSolution {
    public static boolean nQueens(char board[][],int row){
        if(row==board.length){
            return true;
        }

        for(int j=0;j< board.length;j++){
          if(isSafe(board,row,j)){
             board[row][j]='Q';
            if( nQueens(board,row+1)){
                return true;
            }
             board[row][j]='X';
          }
        }
        return false;
    }
    public static boolean isSafe(char board[][],int row,int col){
    for(int i=row-1;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
    }
    for(int i=row-1,j=col-1;i>=0&& j>=0;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    for(int i=row-1,j=col+1;i>=0 && j<board[0].length;i--,j++){
       if(board[i][j]=='Q'){
           return false;
       }
    }
    return true;
    }
    public static void main(String[] args) {
        int n=3;
        char board[][]=new char[n][n];
       System.out.print( nQueens(board,0));
    }
}
