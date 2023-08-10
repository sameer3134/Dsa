import java.util.Stack;

public class Validparanthesis {
    public static void main(String[] args) {
        String s= "{{(}}";
        char[] m= new char[s.length()];
        int l=-1,b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' ||s.charAt(i)=='(' || s.charAt(i)==']'){
                m[++l]=s.charAt(i);
            }else{
                if(l>-1){
                    if(m[l]=='{' && s.charAt(i)=='}' || m[l]=='(' && s.charAt(i)==')' || (m[l]=='[' && s.charAt(i)==']')){
                        l--;
                    }else{
                        b=1;
                        break;
                    }
                }else{
                    b=1;
                    break;
                }
            }
        }
        if(b==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
