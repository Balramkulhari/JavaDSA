class Nqueen2{
        public static int totalNQueens(int n) {
                char board[][] = new char[n][n];
                int row = n;
                int col = n ;
                return NQueens(board,0);

        }
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
        public static int NQueens(char board[][] , int i ){
                if(i==board.length){
                        return 1;
                }
                int count = 0 ;

                for(int j = 0 ;j<board.length;j++){
                        if(IsSafe(board,i,j)) {
                                board[i][j] = 'Q';
                                NQueens(board, i + 1);
                                board[i][j] = '-';
                        }
                }
                return count;
        }

        public static void main(String[] args) {
            System.out.println(totalNQueens(4   ));
        }
}