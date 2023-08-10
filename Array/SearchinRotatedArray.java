class  rotated{
    public static void main(String[] args) {
        int[] a={3,4,5,6,1,2}; int m=1;
        int low=0,high=a.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==m){
                System.out.println(mid);
                return;
            }
            if(a[low]<=a[mid]){
                if(m>=a[low] && m<=a[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            if(a[mid]<=a[high]){
                if(m>=a[mid] && m<=a[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
    }
}