import java.util.Collections;
import java.util.PriorityQueue;

public class ksmallestelement {
    public static void main(String[] args) {
        int[] a={ 7 ,10, 4 ,20, 15};
        int k=4;
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(a[i]);
        }
        for(int i=k;i<a.length;i++){
            if(pq.peek()>a[i]){
                pq.poll();
                pq.add(a[i]);
            }
        }
        System.out.println(pq.peek());
    }
}
