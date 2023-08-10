import java.util.Stack;

public class NextSmallerElement {
     public static void main(String[] args) {
        int[] arr={11,13,21,3};
        int[] ans=new int[arr.length];
        Stack<Integer> st= new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            if(arr[st.peek()]>arr[i]){
                while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                    ans[st.peek()]=arr[i];
                    st.pop();
                }   
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.peek()]=-1;
            st.pop();
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        
    }
}
