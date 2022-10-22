package Tree;

import java.util.Stack;

/*
Implementation of Tree data structure from scratch.
with pre-order , In-order and post-order traversal using recursion
 */
public class BinaryTree {
    Node root;
     class  Node {
        int data;
        Node left ;
       Node  right;

        public Node (int data){
            this.data = data;
            left = null;
            right = null;
        }
        public void addTree(int data){
            this.data = data;
        }
    }
    void createBinaryTree() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(5);
        Node fifth = new Node(8);
        Node sixth = new Node(10);
        root = first;
        first.left= second;
        first.right =third;
        second.left = fourth;
        second.right = fifth;
        third.right  = sixth;

    }
    void pre_OderPrint(Node root) {
       if(root != null) {
           System.out.println("--->"+ root.data);
           pre_OderPrint(root.left);
           pre_OderPrint(root.right);
       }
    }
    void In_OderPrint(Node root) {  // in-order using recursion
        if(root != null) {
            In_OderPrint(root.left);
            System.out.println("--->"+ root.data);
            In_OderPrint(root.right);
        }
    }
    void In_OrderPrintR(Node root) {  // iterative  way
         Stack<Node> s = new Stack<>();
         Node curr = root;
         s.add(curr);
         while( !s.isEmpty() ) {

             while(curr.left!=null) {
                 curr = curr.left;
                 s.add(curr);
             }

             Node temp = s.pop();
             System.out.println(temp.data);
             if(temp.right != null) {
                 curr = temp.right;
                 s.add(curr);

             }
         }
    }

    void post_OderPrint(Node root) {
        if(root != null) {
            post_OderPrint(root.left);
            post_OderPrint(root.right);
            System.out.println("--->"+ root.data);
        }
    }

    void pos_orderPrintR(Node root){
      Stack<Node> s1 = new Stack<>();
      Stack<Node> s2 = new Stack<>();
       Node curr = root;
       s1.add(curr);
       while(!s1.isEmpty()) {

          Node temp = s1.pop();
          s2.add(temp);
          if(temp.left != null) s1.add(temp.left);

          if(temp.right != null) s1.add(temp.right);

       }
       while ( !s2.isEmpty()) {
           Node val = s2.pop();
           System.out.println(val.data);
       }
    }
    // &Stn62%5&WWF

    public static void main(String[] args) {
        //System.out.println(q.peek());
        BinaryTree tree = new BinaryTree();
       tree.createBinaryTree();
       // System.out.println(tree.root.data);
       //tree.post_OderPrint(tree.root);
        tree.pos_orderPrintR(tree.root);
     //  tree.In_OderPrint(tree.root);
       // tree.In_OrderPrintR(tree.root);

    }
}
