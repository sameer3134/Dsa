import java.util.Arrays;

public class Arrangerraytobiggestno {
    public static void main(String[] args) {
        int[] a={54, 546, 548, 60};
        String[] s=new String[a.length];
        for(int i=0;i<a.length;i++){
            s[i]=String.valueOf(a[i]);
        }
        Arrays.sort(s,(d,b)->(b+d).compareTo(d+b));   //sort array in descending order
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length;i++){
            sb.append(s[i]);
        }
        String result=sb.toString();
        System.out.println(result.startsWith("0")?"0":result);  //  [0,0,0] to 0 converts
    }
}
