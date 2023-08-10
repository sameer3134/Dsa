public Node addTwoNumbers(Node l1,Node l2) {   {1,2,3}+{4,5,6}
    int carry=0,sum=0;
    Node dumy= new Node(0);
    Node curr=dumy;
    while(l1!=null ||l2!=null||carry==1){
        int sum=0;
        if(l1!=null){
            sum+=l1.data;
            l1=l1.next;
        }
        if(l2!=null){
            sum+=l2.data;
            l2=l2.next;
        }
        int total=sum+carry;
        carry=total/10;
        Node s= new Node(total%10);
        curr.next=s;
        curr=curr.next;                       // till taht we get in reverse {9,7,5}
    }
     return dumy.next;                                         //after that we reverse it as a single lind list
}