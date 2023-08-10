public class RemoveConsecutiveChar {
    public static void main(String[] args) {
        String s="aaabb",m="";
        m+= s.charAt(0);
        int j=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=m.charAt(j)){
                j++;
                m+= s.charAt(i);
            }
        }
        System.out.println(m);
    } 
}
