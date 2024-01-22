class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int max = board.length;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                
                if(board[i][j]==1){
                    if(((i-1>-1)&&(j-1)>-1)&&board[i-1][j-1]!=1) board[i-1][j-1] = 2;
                    if((i-1)>-1&&board[i-1][j]!=1) board[i-1][j] = 2;
                    if((i-1>-1)&&(j+1)<max&&board[i-1][j+1]!=1) board[i-1][j+1] = 2;
                    if((j-1)>-1&&board[i][j-1]!=1) board[i][j-1] = 2;
                    if((j+1)<max&&board[i][j+1]!=1) board[i][j+1] = 2;
                    if(((i+1)<max)&&(j-1)>-1&&board[i+1][j-1]!=1) board[i+1][j-1] = 2;
                    if((i+1)<max&&board[i+1][j]!=1) board[i+1][j] = 2;
                    if(((i+1)<max)&&(j+1)<max&&board[i+1][j+1]!=1) board[i+1][j+1] = 2;
                    
                }
            }
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]==0) answer++;
            }
        }
        return answer;
    }
}