class Solution {
    public int numRookCaptures(char[][] board) {

        int rockrow=0;
        int rockcol=0;

        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){

                if(board[i][j]=='R'){
                      rockrow=i;
                      rockcol=j;
                      break;
                }
            }
        }

        int count=0;
        for(int i=rockrow; i>=0; i--){
            if(board[i][rockcol] == 'p'){
                count++;
                break;
            }else if(board[i][rockcol] == 'B'){
                break;
            }
        }

        for(int i=rockrow; i<8; i++){
            if(board[i][rockcol]=='p'){
                count++;
                break;
            }else if(board[i][rockcol]=='B'){
                break;
            }
        }

        for(int j=rockcol; j>=0; j--){
            if(board[rockrow][j] == 'p'){
                count++;
                break;
            }
            else if(board[rockrow][j]=='B'){
                break;
            }
        }

        for(int j=rockcol; j<8; j++){
            if(board[rockrow][j]== 'p'){
                count++;
                break;
            }
            else if(board[rockrow][j]=='B'){
                break;
            }
        }
        return count;
        
    }
}