public class totalleafnodesintree {
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

    public static int leafCount(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }

        int lc=leafCount(root.left);
        int rc=leafCount(root.right);
        return lc+rc;
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(10);
        root.right=new Node(39);
        root.left.left=new Node(5);

        System.out.println(leafCount(root));
    }
}
