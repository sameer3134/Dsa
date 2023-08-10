public class smaleestnowithdigitsumoddigit {
    public static void main(String[] args) {
        int s=20,d=3;
        if(d*9<s){
            System.out.println("not possible");
            return;
        }
        int[] m=new int[d];
        s=s-1;
        for(int i=d-1;i>0;i--){
            if(s>9){
                m[i]=9;
                s-=9;
            }else{
                m[i]=9;
                s=0;
            }
        }
        
        m[0]=s+1;
        for(int i=0;i<m.length;i++){
            System.out.print(m[i]);
        }
    }
}
