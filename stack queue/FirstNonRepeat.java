import java.util.Queue;
import java.util.HashMap;
import java.util.LinkedList;

public class FirstNonRepeat {
    public static void main(String[] args) {
        char[] ch={'a','a','b','c','c','d'};
        Queue<Character> q= new LinkedList();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
            if(map.get(ch[i])==1){
                q.add(ch[i]);
            }
            while(!q.isEmpty()){
                if(map.get(q.peek())==1){
                    break;
                }else{
                    q.remove();
                }
            }
        }
        if(q.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(q.peek());
        }
    }
}
