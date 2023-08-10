public class LongestPrefixSuffix {
    public static void main(String[] args) {
        String s="abshjab";
        int mod=100000007,pow=1,ph=0,ssh=0,p=31,ans=0;
        for(int i=0;i<s.length()-1;i++){
            ph=((p*ph)+(s.charAt(i)-'a'+1))%mod;
            ssh=(ssh+((s.charAt(s.length()-i-1)-'a'+1)*pow)%mod)%mod;
            pow=(p*pow)%mod;
            if(ph==ssh){
                ans=i+1;
            }
        }
        System.out.println(s.substring(0, ans));
    }
}
