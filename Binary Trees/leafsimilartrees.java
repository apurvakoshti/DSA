import java.util.*;
public class leafsimilartrees {
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

    public static void isLeafSimilar(Node root, ArrayList<Integer> sequence){
        if(root==null){
            return;
        }

        if(root.left==null && root.right==null){
            sequence.add(root.data);
            return;
        }

        isLeafSimilar(root.left, sequence);
        isLeafSimilar(root.right, sequence);

    }

    public static boolean leafSimilar(Node root1, Node root2){
        ArrayList<Integer> sequence1= new ArrayList<>();
        ArrayList<Integer> sequence2= new ArrayList<>();

        isLeafSimilar(root1, sequence1);
        isLeafSimilar(root2, sequence2);

        return sequence1.equals(sequence2);
    }

    
    public static void main(String args[]){
        Node root1=new Node(3);
        root1.left=new Node(5);
        root1.right=new Node(1);
        root1.left.left=new Node(6);
        root1.left.right=new Node(2);
        root1.left.right.left=new Node(7);
        root1.left.right.right=new Node(4);
        root1.right=new Node(1);
        root1.right.left=new Node(9);
        root1.right.right=new Node(8);

        Node root2= new Node(3);
        root2.left=new Node(5);
        root2.left.left=new Node(6);
        root2.left.right=new Node(7);
        root2.right=new Node(1);
        root2.right.left=new Node(4);
        root2.right.right=new Node(2);
        root2.right.right.left=new Node(9);
        root2.right.right.right=new Node(8);


        System.out.println(leafSimilar(root1, root2));

    }
}
