import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int left = 0, top = 0, bottom = matrix.length-1, right = matrix[0].length-1;
        List<Integer> list = new ArrayList<>();

        while(top <= bottom && left <= right){

            for(int i=left; i<=right; i++)
               list.add(matrix[top][i]);
            top++;

            for(int i=top; i<=bottom; i++)
                list.add(matrix[i][right]);
            right--;

            if (top <= bottom){
            for(int i=right; i>=left; i--)
                list.add(matrix[bottom][i]);
            bottom--;
            }

            if (left <= right){
            for(int i=bottom; i>=top; i--)
                list.add(matrix[i][left]);
            left++;
            }
        }
        System.out.println(list);
    }
}
