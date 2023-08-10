public class OtoXReplace {
    public static void main(String[] args) {
        char[][] mat = { { 'X', 'O', 'X',
                'O', 'X', 'X' },
                { 'X', 'O', 'X',
                        'X', 'O', 'X' },
                { 'X', 'X', 'X',
                        'O', 'X', 'X' },
                { 'O', 'X', 'X',
                        'X', 'X', 'X' },
                { 'X', 'X', 'X',
                        'O', 'X', 'O' },
                { 'O', 'O', 'X',
                        'O', 'O', 'O' } };
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 'O') {
                    mat[i][j] = '-';
                }
            }
        }
        for (int j = 0; j < mat[0].length; j++) {
            if (mat[0][j] == '-') {
                fill(mat, 0, j, '-', 'O');
            }
        }
        for (int j = 0; j < mat[0].length; j++) {
            if (mat[j][0] == '-') {
                fill(mat, j, 0, '-', 'O');
            }
        }
        for (int j = 0; j < mat[0].length; j++) {
            if (mat[mat.length - 1][j] == '-') {
                fill(mat, mat.length - 1, j, '-', 'O');
            }
        }
        for (int j = 0; j < mat[0].length; j++) {
            if (mat[j][mat[0].length - 1] == '-') {
                fill(mat, j, mat[0].length - 1, '-', 'O');
            }
        }
        for (int i = 0; i < mat.length; i++){
        for (int j = 0; j < mat[0].length; j++){
            if (mat[i][j] == '-')
                mat[i][j] = 'X';
    }}
    for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j] + " ");
                 
            System.out.println("");
        }
    }

    static void fill(char mat[][], int x,
            int y, char prevV,
            char newV) {
        // Base cases
        if (x < 0 || x >= mat.length ||
                y < 0 || y >= mat[0].length)
            return;

        if (mat[x][y] != prevV)
            return;

        // Replace the color at (x, y)
        mat[x][y] = newV;

        // Recur for north,
        // east, south and west
        fill(mat, x + 1, y,
                prevV, newV);
        fill(mat, x - 1, y,
                prevV, newV);
        fill(mat, x, y + 1,
                prevV, newV);
        fill(mat, x, y - 1,
                prevV, newV);
    }
}
