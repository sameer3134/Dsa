///{{1,4,7},{2,5,8},{3,6,9}}=<{1,2,3,4,5,6,7,8,9}   //k no. of row

class MergeKSorted(Node arr[],int k) {
    int i=0,j;
    int last=k-1;
    while(last!=0){
        i=0;
        j=last;
        while(i<j){
            arr[i]=merge(arr[i],arr[j]);
            i++;
            j--;
            if(i>=j){
                last=j;
            }
        }
    }
    return arr[0];
}
 ListNode merge(ListNode a,ListNode b){
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        ListNode f=null;
        if(a.data<=b.data){
            f=a;
            f.next=merge(a.next,b);
        }else{
            f=b;
            f.next=merge(a,b.next);
        }
        return f;
    }
