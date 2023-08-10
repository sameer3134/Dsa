public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat", t = "car";
        s.toLowerCase();
        s.toUpperCase();
        int[] s1=new int[26];
        int[] t1=new int[26];
        if(s.length()!=t.length()){
            System.out.println(false);
        }
        for(int i=0;i<s.length();i++){
            s1[s.charAt(i)-'a']+=1;
            t1[t.charAt(i)-'a']+=1;
        }
        int m=0;
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=t1[i]){
                m=1;
            }
        }
        if(m==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
