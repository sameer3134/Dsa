public class RearrangeNoTwoAdjacent {
    public static void main(String[] args) {
        String s="aaabc";
        int[] ch=new int[26];
        int max=Integer.MIN_VALUE;
        char c=s.charAt(0);
        for(int i=0;i<s.length();i++){
            int v=s.charAt(i)-'a'; 
            ch[v]++;
            if(ch[v]>max){
                max=ch[v];
                c=s.charAt(i);
            }         
        }
       int ind=0;
       String m="";
       for(int i=0;i<s.length();i++){
            m+= ' ';
       }
       int n=s.length();
       while(max>0){
            m=m.substring(0, ind)+c+m.substring(ind+1);
            ind=ind+2;
            max--;
       }
       ch[c-'a']=0;
       for(int i=0;i<26;i++){
            while(ch[i]>0){
                ind=(ind>n)? 1:ind;
                m=m.substring(0, ind)+(char)('a'+i)+m.substring(ind+1);
                ind+=2;
                ch[i]--;
            }
       }
       for(int i=0;i<n;i++){
            System.out.print(m.charAt(i));
       }
    }
}
