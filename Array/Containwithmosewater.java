public class Containwithmosewater {
    public static void main(String[] args) {
        int[] he={1,8,6,2,5,4,8,3,7};
        int left=0,right=he.length-1;
        int area=0;
        while(left<=right){
            int w=right-left;
            int h=Math.min(he[left],he[right]);
            area=Math.max(area, w*h);
            if(he[right]<he[left]){
                right--;
            }else if(he[right]>he[left]){
                left++;
            }else{
                right--;
                left++;
            }
        }
        System.out.println(area);
    }
}
