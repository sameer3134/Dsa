import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "zoomlazapzo", p = "oza";
        String ans = s;
        int an = ans.length(), count = 0, c = 0, i = -1, j = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> bap = new HashMap<>();
        for (int k = 0; k < p.length(); k++) {
            map.put(p.charAt(k), map.getOrDefault(p.charAt(k), 0) + 1);
            count++;
        }
        System.out.println(5);
        while (true) {
            while (i < s.length() - 1 && (c < count)) {
                i++;
                bap.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                if (map.getOrDefault(s.charAt(i), 0) > bap.getOrDefault(s.charAt(i), 0)) {
                    c++;
                }
            }
            while (j < i && c == count) {
                if (s.substring(i + 1, j + 1).length() < an) {
                    ans = s.substring(i + 1, j + 1);
                    an = ans.length();
                }
                j++;
                if (bap.get(s.charAt(j)) == 1) {
                    bap.remove(s.charAt(j));
                } else {
                    bap.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                }
                if (map.getOrDefault(s.charAt(j), 0) > bap.getOrDefault(s.charAt(j), 0)) {
                    c--;
                }
                System.out.println(ans);
            }
        }
        
    }
}
