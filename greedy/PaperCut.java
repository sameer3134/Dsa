public class PaperCut {
    public static void main(String[] args) {
        int a=13,b=29;  //13*29
        System.out.println(paper(a,b));
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static int paper(int a,int b){
        int sum=0,rem=0;
        if(b>a){
            swap(a,b);
        }
        while(b>0){
            sum+= a/b;      
            rem= a%b;
            a=b;
            b=rem;
        }
        return sum;
    }
}
