// Java program to find length of the longest valid
// substring

import java.util.Stack;

class Tes
{
	// method to get length of the longest valid
	static int findMaxLen(String str)
	{
		Stack<Integer> st = new Stack<>();;
        st.push(-1);
		int result = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                st.push(i);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
                if(!st.isEmpty()){
                    result=Math.max(result,i-st.peek());
                }
                else{
                    st.push(i);
                }
            }
        }
        return result;
	}

	// Driver code
	public static void main(String[] args)
	{
		String str = "((()()";
	
		// Function call
		System.out.println(findMaxLen(str));

		str = "()(()))))";
	
		// Function call
		System.out.println(findMaxLen(str));
	}
}
