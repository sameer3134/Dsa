public class Onestringtoanother {
    public static void main(String[] args) {
        String a = "EACBD", b = "EABCD";
        int[] c=new int[26],d=new int[26];
        if(a.length()!=b.length()){
            System.out.println("not possible");
        }
        for(int i=0;i<a.length();i++){
            c[a.charAt(i)-'A']++;
            d[b.charAt(i)-'A']++;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]!=d[i]){
                System.out.println("not possible");
            }
        }
        int i=a.length()-1,j=b.length()-1;
        int ans =0;
        while(i>=0){
            if(a.charAt(i)!=b.charAt(j)){
                ans++;
            }else{
                j--;
            }
            i--;
        }
        System.out.println(ans);
    }
}
