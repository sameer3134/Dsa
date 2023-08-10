public class MinfinishJob {
    static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        int k=2;
        int[] job={4,5,10};
        int[] res= new int[k];
        jobs(job,0,res);
        System.out.println(min);
    }
    static void jobs(int[] job,int j,int[] sum){
        int max=getmax(sum);
        if(max>=min){
            return;
        }  
        if(j==job.length){
            min=Math.min(min,max);
            return;
        }
        for(int i=0;i<sum.length;i++){
            if(i>0 && sum[i]==sum[i-1])
                continue;
            sum[i]+=job[j];
            jobs(job,j+1,sum);
            sum[i]-=job[j];
        }
    }
    static int getmax(int[] sum){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sum.length;i++){
            max=Math.max(sum[i],max);
        }
        return max;
    }
}
