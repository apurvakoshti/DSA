public class mindepthoftree {
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

    public static int minDepth(Node root){
        if(root==null){
            return 0;
        }

        if(root.left==null && root.right==null){
            return 1;
        }

        if(root.left==null){
            return minDepth(root.right)+1;
        }

        if(root.right==null){
            return minDepth(root.left)+1;
        }

        return Math.min(minDepth(root.left),minDepth(root.right))+1;

    }
    public static void main(String args[]){
        Node root= new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);

        System.out.println(minDepth(root));
    }
}
