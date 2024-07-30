public class totalnodesoftree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int count(Node root){
        if(root==null){
            return 0;
        }

        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }

    public static void main(String args[]){
        Node root= new Node(1);
        root.left=new Node(2);
        root.right= new Node(3);
        root.right.left=new Node(4);
        root.right.left.left= new Node(5);
        root.right.right=new Node(6);

        System.out.println(count(root));

    }
}
