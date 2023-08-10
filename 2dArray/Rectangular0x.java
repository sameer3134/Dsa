import java.util.ArrayList;
import java.util.List;

public class Rectangular0x {
    public static void main(String[] args) {
        int m=5, n=5,r=5,c=5;
        int i,k = 0, l = 0;
        char[][] a=new char[m][n];
        char x='X';
        while (k < m && l < n)
        {
            /* Fill the first row from the remaining rows */
            for (i = l; i < n; ++i)
                a[k][i] = x;
            k++;
     
            /* Fill the last column from the remaining columns */
            for (i = k; i < m; ++i)
                a[i][n-1] = x;
            n--;
     
            /* Fill the last row from the remaining rows */
            if (k < m)
            {
                for (i = n-1; i >= l; --i)
                    a[m-1][i] = x;
                m--;
            }
     
            /* Print the first column
                    // from the remaining columns */
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                    a[i][l] = x;
                l++;
            }
            x = (x == '0')? 'X': '0';
        }
        for(i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
