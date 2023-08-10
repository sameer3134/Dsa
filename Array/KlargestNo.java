import java.util.PriorityQueue;

public class KlargestNo {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,6,4};
        int k=2;
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq.peek());
    }
}
