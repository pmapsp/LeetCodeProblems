/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new LinkedList <List<Integer>>();
        
        if(root == null){
            return result;
        }
        
        Queue <Node> q = new LinkedList <Node>();
        q.add(root);
        Node auxN;
        
        while(!q.isEmpty()){
            List<Integer> auxL =  new LinkedList <Integer>();
            int length = q.size();
            
            for(int i = 0; i < length; i++){
                auxN = q.poll();
                auxL.add(auxN.val);
                if(!auxN.children.isEmpty()){
                    for(Node n : auxN.children){
                        q.add(n);
                    }
                }
            }
            result.add(auxL);
        }
        return result;
    }
}
