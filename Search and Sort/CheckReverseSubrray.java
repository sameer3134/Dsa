import java.util.Arrays;

public class CheckReverseSubrray {
    public static void main(String[] args) {
 
        int arr[] = {1, 2, 4,5, 3};
        int n = arr.length;
 
        if (checkReverse(arr, n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
}
public static boolean checkReverse(int[] a,int n){
    int[] temp= new int[n];
    for(int i=0;i<n;i++){
        temp[i]=a[i];
    }
    int front,back;
    Arrays.sort(a);
    for(front=0;front<n;front++){
        if(temp[front]!= a[front]){
            break;
        }
    }
    for(back=n-1;back>=0;back--){
        if(temp[back]!= a[back]){
            break;
        }
    }
    if(front>=back){
        return true;
    }
    while(front!=back){
        front++;
        if(temp[front-1]<temp[front]){
            return false;
        }
    }
    return true;
}
}