class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
        if(root==null){
            return finalAns;
        }
        q.add(root);
        while(!q.isEmpty()){
            int levels = q.size();
            List<Integer> subLevels = new ArrayList<>();        
            for(int i=0;i<levels;i++){
                TreeNode s=q.peek();
                q.remove();
                if(s.left!=null){
                    q.add(s.left);
                }
                if(s.right!=null){
                    q.add(s.right);
                }
                subLevels.add(s.val);
            }
            finalAns.add(subLevels);
        }
        return finalAns;
    }
}