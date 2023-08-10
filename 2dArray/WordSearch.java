public class WordSearch {
    public static void main(String[] args) {
        char[][] s={{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        int b=0;
        String word="seejkkhj";
        for(int row=0;row<s.length;row++){
            for(int col=0;col<s[0].length;col++){
                if(s[row][col]== word.charAt(0) && nif(s,word,row,col,0)){
                    b=1;
                }
            }
        }
        if(b==0){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }
    public static boolean nif(char[][] board,String word, int i, int j, int k){
        if(i<0 || i>=board.length|| j<0 || j>= board[0].length){
            return false;
        }
        if(board[i][j] == word.charAt(k))
        {
            char temp = board[i][j];
            board[i][j]='#';
            if(k==word.length()-1)
            {
                return true;
            }
            else if(nif(board, word, i-1, j, k+1) ||nif(board, word, i+1, j, k+1) ||nif(board, word, i, j-1, k+1) ||nif(board, word, i, j+1, k+1))
            {
                return true;
            }
            board[i][j]=temp;
        }
        return false;
    }
}
