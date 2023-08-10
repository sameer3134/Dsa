public class PatternSearching {
    public static void main(String[] args) {
        String txt= "this is a test test", pat="test";
        int n=txt.length(),m=pat.length(),c=0;
        for(int i=0;i<n-m+1;i++){
            int l=i;
            for(int j=0;j<m;j++){
                if(txt.charAt(l)==pat.charAt(j)){
                    c++;
                }
                if(c==m){
                    System.out.println(i);
                }
                l++;
            }
            c=0;
        }
    }
}
