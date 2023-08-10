import java.util.Stack;

// Java program to find duplicate parenthesis in a
class kjkf {

// Function to find duplicate parenthesis in a
// balanced expression
	static boolean findDuplicateparenthesis(String s) {
		Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    return true;
                }else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                 st.push(ch);       
            }
        }
        return false;
	}

// Driver code
public static void main(String[] args) {

		// input balanced expression
		String str = "(((a+(b))+((c+d))))";

		if (findDuplicateparenthesis(str)) {
			System.out.println("Duplicate Found ");
		} else {
			System.out.println("No Duplicates Found ");
		}

	}
}
