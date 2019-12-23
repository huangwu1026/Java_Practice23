import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int  val;
    TreeNode left;
    TreeNode right;
}
class Solution{
    public boolean isSubTree(TreeNode s, TreeNode t){
        if(s.val != t.val){
            return isSubTree(s.left, t)||isSubTree(s.right, t);
        }else{
            return  isSubTree(s ,t)||isSubTree(s.left, t)||isSubTree(s.right, s);
        }
    }
    public int MathDepth(TreeNode root){
        if(root == null){
            return 0;
        }else{
            int left = MathDepth(root.left);
            int right = MathDepth(root.right);
            return left > right ? left + 1:right +1;
        }
    }


    public boolean isSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        return left.val == right.val
                &&isSymmetric(left.left, right.right)
                &&isSymmetric(left.right, right.left);
    }
    public boolean isSymmetric2(TreeNode root){
        if(root == null){
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            TreeNode topNode = queue.poll();
            if(topNode == null)
                break;
            queue.offer(TreeNode.left);

        }
    }



    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            else if (l2 == null) {
                return l1;
            }
            else if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            }
            else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
    }

    public List<List<Integer>>


