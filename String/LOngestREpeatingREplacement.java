import java.util.HashMap;

public class LOngestREpeatingREplacement {
    public static void main(String[] args) {
        String s="ABAB"; int k=2;
        int start=0,end=0,maxlength=0,count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(end=0;end<s.length();end++){
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end),0)+1);
            count=Math.max(count,map.get(s.charAt(end)));
            if(end-start+1 - count>k){
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }
            maxlength=Math.max(maxlength,end-start+1);
        }
        
        System.out.println(maxlength);

    }
}
