public class searchinbst{
    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int val){
            this.data=val;
        }

    }

    public static Node insert(Node root, int val){
        if(root==null){
            root= new Node(val);
            return root;
        }

        if( val > root.data){
            root.right= insert(root.right, val);
        }
        else{
            root.left= insert(root.left, val);
        }

        return root;

    }

    public static boolean search(Node root, int val){
        if(root==null){
            return false;
        }

        if(root.data==val){
            return true;
        }

        if( val > root.data){
            return search(root.right, val);

        }
        else{
            return search(root.left, val);
        }

    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0; i< values.length; i++){
            root= insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        if(search(root, 4)){
            System.out.println("key found");
        }
        else{
            System.out.println("key not found");
        }

    }
}