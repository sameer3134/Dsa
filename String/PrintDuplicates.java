import java.util.HashMap;
import java.util.Map;

public class PrintDuplicates {
    public static void main(String[] args) {
        String str = "test string";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character,Integer> mapElement : map.entrySet()) {   //iterating through the unordered map
            if (mapElement.getValue() > 1)   //if the count of characters is greater than 1 then duplicate found
              System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
          }
    }
}
