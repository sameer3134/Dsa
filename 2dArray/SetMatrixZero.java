public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
        int r=arr.length,c=arr[0].length,col0=1;
        for(int i=0;i<r;i++){
            if(arr[i][0]==0){
                col0=0;
            }
            for(int j=1;j<c;j++){
            if(arr[i][j]==0){
                arr[i][0]=arr[0][j]=0;
            }
        }
    }
        for(int i=r-1;i>=0;i--){
            if(col0==0){
                arr[i][0]=0;
            }
            for(int j=c-1;j>=0;j--){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }
    
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }
    }
}
