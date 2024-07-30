import java.util.*;
public class levelordertraversal {
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

    public static void levelOrder(Node root, List<Integer> ans){
        if(root==null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println(" ");
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }

            }
            else{
                ans.add(currNode.data);
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }


    }

    public static List<Integer>levelOrderTraversal(Node root){
        List<Integer> result= new ArrayList<>();
        levelOrder(root, result);
        return result;

    }


    public static void main(String args[]){
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);

       System.out.println(levelOrderTraversal(root));
    }
}
