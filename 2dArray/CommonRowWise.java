import java.util.HashMap;
import java.util.Map;

public class CommonRowWise {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4, 5 },
                { 2, 4, 5, 8, 10 },
                { 3, 5, 7, 9, 11 },
                { 1, 3, 5, 7, 9 } };
        int r = mat.length, c = mat[0].length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<c;i++){
            map.put(mat[0][i],1);
        }
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map.containsKey(mat[i][j]) && map.get(mat[i][j])==i) {
                        map.put(mat[i][j], map.get(mat[i][j]) + 1);
                }
                if(i==r-1 && map.containsKey(mat[i][j])&& map.get(mat[i][j])==r){
                    System.out.println(mat[i][j]);
                }
            }
        }
            
        }
    }

