public class symmetrictree {
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

    public static boolean isSymmetricUtil(Node root1, Node root2){
        if(root1==null || root2==null){
            return root1==root2;
        }

        if(root1.data==root2.data){
            return true;
        }

        return isSymmetricUtil(root1.left, root2.right) && isSymmetricUtil(root2.right, root1.left);
    }
    public static boolean isSymmetric(Node root){
        if(root==null){
            return true;
        }

        return isSymmetricUtil(root.left, root.right);
    }
    public static void main(String args[]){
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(2);
        root.left.left= new Node(3);
        root.left.right= new Node(4);
        root.right.left=new Node(4);
        root.right.right=new Node(3);

       

        System.out.println(isSymmetric(root));
    }
}
