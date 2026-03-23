public class nQueen{
    public static boolean IsSafe(char board[][] , int row , int col){
        //vertical up
        for(int i = row-1 ; i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i = row -1 ,j=col-1 ; i>=0&&j>=0 ;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //digonal rigtUp
        for(int i = row-1 ,j=col+1 ; i>=0&&j<board.length ;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void NQueens(char board[][] , int i ){
        if(i==board.length){
            printBoard(board);
            return;
        }

        for(int j = 0 ;j<board.length;j++){
            if(IsSafe(board,i,j)) {
                board[i][j] = 'Q';
                NQueens(board, i + 1);
                board[i][j] = '-';
            }
        }
    }
    public static void printBoard(char borad[][]){
        for(int i = 0 ;i<borad.length;i++){
            for(int j = 0;j< borad.length;j++){
                System.out.print(borad[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------chess board--------------");

    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int  i = 0 ;i<n;i++){
            for(int j = 0 ; j<n;j++) {
                board[i][j] = '-';
            }
        }
        NQueens(board ,0);

    }
}