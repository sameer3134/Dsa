import java.util.List;
import java.util.HashMap;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] s={"eat","tea","tan","ate","nat","bat"};
        HashMap<HashMap<Character,Integer>,List<String>> bmap= new HashMap<>();
         for(String str:s){     // for(int i=0;i<s.length;i++)
            HashMap<Character,Integer> fmap= new HashMap<>();
            for(int i=0;i<str.length();i++){
                fmap.put(str.charAt(i), fmap.getOrDefault(str.charAt(i), 0)+1);
            }
            if(bmap.containsKey(fmap)==false){
                List<String> list= new ArrayList<>();
                list.add(str);
                bmap.put(fmap,list);
            }else{
                List<String> list= bmap.get(fmap);
                list.add(str);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> val: bmap.values()){
            res.add(val);
        }
        System.out.println(res);
    }
}
