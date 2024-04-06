public class creationofbst {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int val){
            this.data=val;
        }

    }

    public static Node insertIntoBST(Node root, int val){
        if( root==null){
            root= new Node(val);
            return root;
        }

        if( val > root.data){
            root.right= insertIntoBST(root.right, val);
            
        }
        else{
            root.left= insertIntoBST(root.left, val);
           
        }

        return root;

    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);

    }
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
            Node root= null;
            for(int i=0; i< values.length; i++){
                root=insertIntoBST(root, values[i]);

            }

            inOrder(root);
            System.out.println();

    }
}
