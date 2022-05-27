class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;

    }
}
public class LLtest {
    Node head;

    private int size=0;
    public void addfirst(int data){

        Node newnode = new Node(data);

        if(head==null){
            head=newnode;
            size++;
            return;
        }
        newnode.next=head;
        head=newnode;
        size++;

    }

    public void addlast(int data){
        Node newnode = new Node(data);

        if(head==null){
            head=newnode;
            size++;
            return;
        }
        Node currentnode=head;
        while(currentnode.next!=null){
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;

    }
    public void deletelast(){
        Node lsnode=head;
        Node lnode=head.next;

        while(lnode.next!=null){
            lnode=lnode.next;
            lsnode=lsnode.next;
        }
        lsnode.next=null;

    }
    public void deletefirst(){
        Node currentnode= head.next;
        head=currentnode;

    }

    public void printlist(){

        if(head==null){
            System.out.println("Node is empty");
            return;
        }
        Node currentnode = head;

        while(currentnode!=null){
            System.out.print(currentnode.data +"-->");
            currentnode=currentnode.next;
        }
        System.out.println("NUll");
    }



    public  static void main(String args[]){
        LLtest list = new LLtest();
        list.addfirst(1);
        list.addfirst(2);
        list.addlast(5);
        list.printlist();
        //list.deletelast();
        list.deletefirst();
        list.printlist();


    }
}
