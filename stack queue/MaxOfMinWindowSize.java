import java.util.Stack;

class Min{
    public static void main(String[] args) {
        int a[]={10,20,30,50,10,70,30};
        int n=a.length;
        Stack<Integer> st= new Stack<>();
        int[] right=new int[n+1];
        int[] left=new int[n+1];
        for(int i=0;i<n;i++){
            left[i]=-1;
            right[i]=n;
        }
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && a[st.peek()]>=a[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                left[i]=st.peek();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && a[st.peek()]>=a[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                right[i]=st.peek();
            }
            st.push(i);
        }
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=0;
        }
        for(int i=0;i<n;i++){
            int len=right[i]-left[i]-1;
            ans[len]=Math.max(ans[len], a[i]);
        }
        for(int i=n-1;i>=1;i--){
            ans[i]=Math.max(ans[i], ans[i+1]);
        }
        for(int i=1;i<=n;i++){
            System.out.println(ans[i]);
        }
    }
}