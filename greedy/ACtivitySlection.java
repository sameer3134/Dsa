class activity{
    public static void main(String[] args) {
        int[] s={1,3,0,5,8}, f={2,4,6,7,9,9};
        System.out.println(0);
        int j=0;
        for(int i=1;i<s.length;i++){
            if(s[i]>=f[j]){
                System.out.println(i);
                j=i;
            }
        }
    }
}