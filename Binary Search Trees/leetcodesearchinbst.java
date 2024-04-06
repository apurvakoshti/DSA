public class leetcodesearchinbst {
    class TreeNode{
        int data;
        TreeNode left, right;

        public TreeNode(int val){
            this.data=val;
        }
    }
    public static  TreeNode search(TreeNode root, int val){
        while( root!= null && root.data != val){
            root= val < root.data ? root.left : root.right;
        }

        return root;

    }


}
