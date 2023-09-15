class ROTATE{
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        int k = 3;
        int a= nums.length;
        int l=a-(k%a);
        int[] s= new int[a];
        int i=0,n=0;
        while(i<a){
            s[i]=nums[l%a];
            i++;
            l++;
        }
        for(i=0;i<nums.length;i++){
            nums[i]=s[i];
        }
        for(i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}