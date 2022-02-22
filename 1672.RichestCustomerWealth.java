class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int auxSum = 0;
        
        
        for(int i = 0; i <  accounts.length; i++){
            auxSum = 0;
            for(int k = 0; k < accounts[i].length; k++){
                auxSum += accounts[i][k];
            }
            
            max = Math.max(max, auxSum);
        }
        return max;
    }
}
