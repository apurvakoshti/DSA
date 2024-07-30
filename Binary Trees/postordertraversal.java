import java.util.*;

public class postordertraversal {
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

    public static void postOrder(Node root, List<Integer> ans){
        if(root==null){
            return;
        }
        postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.data);

    }

    public static List<Integer> postOrderTraversal(Node root){
        List<Integer> result= new ArrayList<>();
        postOrder(root, result);
        return result;
    }
    public static void main(String args[]){
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);

       System.out.println(postOrderTraversal(root));
 
    }
}
