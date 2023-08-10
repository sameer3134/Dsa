public class NoofIsland {
    public static void main(String[] args) {
        int[][] m = { { 1, 1, 0, 0, 0 },
        { 0, 1, 0, 0, 1 },
        { 1, 0, 0, 1, 1 },
        { 0, 0, 0, 0, 0 },
        { 1, 0, 1, 0, 1 } };
        int count=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==1){
                    count++;
                    island(m,i,j,m.length,m[0].length);
                }
            }
        }
        System.out.println(count);
    }
    public static void island(int[][] m,int row,int col,int l,int y){
        if(row<0 || row>=m.length || col<0 || col>=m[0].length || m[row][col]==0){
            return;
        }
        if(m[row][col]==1){
            m[row][col]=0;
            island(m,row-1,col,l,y);
            island(m,row+1,col,l,y);
            island(m,row,col-1,l,y);
            island(m,row,col+1,l,y);
            island(m,row,col,l,y);
            island(m,row+1,col+1,l,y);
            island(m,row-1,col-1,l,y);
            island(m,row+1,col-1,l,y);
        }
    }
}
