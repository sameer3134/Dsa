import java.util.Stack;

public class RecursionStackSort {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(5);
        st.push(1);
        st.push(7);
        st.push(3);
        st.push(8);
        sort(st);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
    static void sort(Stack<Integer> st){
        if(!st.isEmpty()){
            int x=st.pop();
            sort(st);
            sorting(st,x);
        }
    }
    static void sorting(Stack<Integer> st,int x){ 
        if(st.isEmpty()|| st.peek()<x){
            st.push(x);
            return;
        }
        int temp=st.pop();
        sorting(st, x);
        st.push(temp);
    }
}
