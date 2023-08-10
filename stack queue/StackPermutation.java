import java.util.Stack;

public class StackPermutation {
    public static void main(String[] args) {
        int[] arr1={1,2,3},arr2={2,1,3};
        Stack<Integer> st= new Stack<>();
        int j=0;
        for(int i=0;i<arr1.length;i++){       
            st.push(arr1[i]);
            if(st.peek()==arr2[j]){
                while(!st.isEmpty() && arr2[j]==st.peek()){
                    st.pop();
                    j++;
                }
            }
        }
        if(st.isEmpty()){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
