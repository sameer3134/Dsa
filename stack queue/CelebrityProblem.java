import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int  m[][] = {{0, 1, 0},
         {0, 0, 0}, 
         {0 ,1 ,0}};
         Stack<Integer> st= new Stack<>();
        for(int i=0;i<m.length;i++){
            st.push(i);
        }
        while(st.size()>=2){
            int i=st.pop();
            int j=st.pop();
            if(m[i][j]==1){
                st.push(j);
            }else{
                st.push(i);
            }
        }
        int pop=st.pop();
        for(int i=0;i<m.length;i++){
            if(i!=pop){
                if(m[i][pop]==0 || m[pop][i]==1){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(pop);
    }
}
