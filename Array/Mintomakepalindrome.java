public class Mintomakepalindrome {
    public static void main(String[] args) {
        int a[] = {1, 4, 5, 9, 1};
        int left=0,right=a.length-1;
        int count=0;
        while(left<=right){
            if(a[left]>a[right]){
                right--;
                a[right]+=a[right+1];            
                count++;
            }else if(a[left]<a[right]){
                left++;
                a[left]+= a[left-1];
                count++;            
            }else{
                left++;
                right--;
            }
        }
        System.out.println(count);
    }
}
