import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static void main(String[] args) {
        int[][] grid={{0,1,2},{0,1,2},{2,1,1}};
        int n=grid.length,m=grid[0].length;
        int count_frsh=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]!=0){
                    count_frsh++;
                }
            }
        }
        int[][] dirs={{1,0},{0,1},{0,-1},{-1,0}};
        int dis=0,cnt=0;
        while(!q.isEmpty()){
            int sz=q.size();
            cnt+=sz;
            for(int r=0;r<sz;r++){
                int[] idx=q.remove();            
                for(int[] dir:dirs){
                    int i=idx[0]+dir[0];
                    int j=idx[1]+dir[1];
                    if(i>=n || j>=m || i<0 || j<0 ||grid[i][j]!=1){
                        continue;
                    }
                    grid[i][j]=2;
                    q.add(new int[]{i,j});            
                }   
            }
            if(!q.isEmpty()){
                dis++;
            }
        }
        if(count_frsh==cnt){
            System.out.println(dis);
        }else{
            System.out.println(-1);
        }
    }
}
