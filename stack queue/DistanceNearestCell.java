import java.util.LinkedList;
import java.util.Queue;

public class DistanceNearestCell {
    public static void main(String[] args) {
        int[][] grid={{0,1,0,0},{1,1,0,0},{0,0,1,1}};
        int n=grid.length,m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        boolean[][] vis= new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j});
                    vis[i][j]=true;
                }
            }
        }
        int[][] result= new int[n][m];
        int[][] dirs={{1,0},{0,1},{0,-1},{-1,0}};
        int dis=0;
        while(!q.isEmpty()){
            int sz=q.size();
            while(sz-->0){
                int[] idx=q.remove();
                int x=idx[0];
                int y=idx[1];
                result[x][y]=dis;
                for(int[] dir:dirs){
                    int i=x+dir[0];
                    int j=y+dir[1];
                    if(i>=0 && j>=0 && i<n && j<m &&vis[i][j]!=true){
                        q.add(new int[]{i,j});
                        vis[i][j]=true;
                    }
                }
            }
            dis++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
