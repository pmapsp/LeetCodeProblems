class Solution {
    public int climbStairs(int n) {
        int n1 =1;
        int n2 =1;
        int aux;
        for(int i = 0 ; i< n; i++){
           aux = n1;
            n1 = n1+n2;
            n2 =aux;
        
        }
        
        return n2;
    }
}
