public class CircularTour {
    public static void main(String[] args) {
        int[] p={6,3,7},d={4,6,3};
        int capacity=0,deficit=0,start=0;
        for(int i=0;i<p.length;i++){
            capacity+= p[i]-d[i];
            if(capacity<0){
                deficit+=capacity;
                capacity=0;
                start=i+1;
            }
        }
        if(capacity+deficit>=0){
            System.out.println(start);
        }else{
            System.out.println(-1);
        }
    }
}
