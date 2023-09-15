class gen{
    public static void main(String[] args) {
        String s="10011100";
        int a=s.charAt(0)+0,b=0;
        int c=s.charAt(s.length()-1)+0,d=s.length()-1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)+0!=a){
                b=i;
                break;
            }
        }
         for(int i=s.length()-2;i>=0;i--){
            if(s.charAt(i)+0!=c){
                d=i;
                break;
            }
        }
        int m=s.charAt(b)+0;   //00111
        int l=1,k=1;
        for(int i=b+1;i<=d;i++){
            if(s.charAt(i)+0==s.charAt(i-1)+0){
                k++;
            }else{
                k=1;
            }
            l=Math.max(l,k);
            
        }
        System.out.println(l);
    }
}