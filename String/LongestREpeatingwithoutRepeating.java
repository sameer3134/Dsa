import java.util.HashSet;
import java.util.Set;

public class LongestREpeatingwithoutRepeating {
    public static void main(String[] args) {
        String a="abcbcabb";
        HashSet<Character> s=new HashSet<>();
        int b=0,c=0,size=0;
        while(c<a.length()){
            if(!s.contains(a.charAt(c))){
                s.add(a.charAt(c));
                c++;
                size=Math.max(size,s.size());
            }else{
                s.remove(a.charAt(b));
                b++;
            }
        }
        System.out.println(size);
    }
}
