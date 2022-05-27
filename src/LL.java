public class LL {               //creating linkedlist from scratch
    Node head;

    private int size=0;
     class Node {
        String data;
        Node next;

        Node(String data){
            this.data= data;
            this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);


        if(head==null){
            head= newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;

        //System.out.println(newNode.data);
    }
    public void addLast(String data){
        Node newNode =new Node(data);

        if(head==null){
            head=newNode;
            size++;

            return;
        }
        Node currentnode = head;
        while(currentnode.next!=null){
            currentnode=currentnode.next;
        }
        currentnode.next=newNode;
        size++;

    }

    public void printlist(){

        if(head==null){
            System.out.println("node is empty");
            return;
        }
        Node currentNode = head;

        while(currentNode!=null){
            System.out.print(currentNode.data+ "->");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");

    }
    public  void deleteFirst(){
         //Node newNode =head;
         head=head.next;
    }

    public void deleteLast(){
         size--;
         if(head.next==null){
             head=null;
         }

         Node lsecondnode=head;
         Node lastnode=head.next;

         while(lastnode.next!=null){
             lastnode=lastnode.next;
             lsecondnode=lsecondnode.next;
         }
         lsecondnode.next=null;
    }

    public static void main(String[]args){

          LL list = new LL();
          list.addFirst("This");
          list.addFirst("is");
          list.addLast("a");
          list.addLast("List");
         list.printlist();
       // list.deleteFirst();
        //list.printlist();
      // list.deleteLast();
        list.printlist();
        System.out.println(list.size);
       // list.addLast("good");


    }
}
