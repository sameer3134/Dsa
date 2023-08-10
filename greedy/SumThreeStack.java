public class SumThreeStack {
    public static void main(String[] args) {
        int[] stack1={3,2,1,1,1};
        int[] stack2={4,3,2};
        int[] stack3={1,1,4,1};
        int n1=stack1.length,n2=stack2.length,n3=stack3.length;
        int a1=0,a2=0,a3=0;
        for(int i=0;i<n1;i++){
            a1+= stack1[i];
        }
        for(int i=0;i<n2;i++){
            a2+= stack2[i];
        }
        for(int i=0;i<n3;i++){
            a3+= stack3[i];
        }
        int b1=0,b2=0,b3=0;
        while(true){
            if(b1==n1 || b2==n2 || b3==n3){
                System.out.println(0);
                return;
            }
            if(a1==a2 && a1==a3){
                System.out.println(a1);
                return;    
            }
            if(a1>=a2 && a1>= a3){
                a1-=stack1[b1++];
            }else if(a2>=a1 && a2>=a3){
                a2-= stack2[b2++];
            }else if(a3>=a2 && a3>=a1){
                a3-= stack3[b3++];
            }
        }
    }
}
