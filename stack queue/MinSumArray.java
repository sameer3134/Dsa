import java.util.PriorityQueue;

public class MinSumArray {
    public static void main(String[] args) {
        int[] a={6,8,4,5,2,3};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        while(!pq.isEmpty()){
            s1.append(pq.poll()+"");
            if(!pq.isEmpty()){
                s2.append(pq.poll()+"");
            }
        }
        Long sum=Long.parseLong(s1.toString())+Long.parseLong(s2.toString());
        System.out.println(sum);
    }
}
