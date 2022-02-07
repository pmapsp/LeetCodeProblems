class Solution {
    public int lengthOfLIS(int[] nums) {
	    int count = 1;
	    int[] aux = new int [nums.length];
	        
	    for(int i = nums.length-1; i >= 0; i--){
	        aux[i] = 1;
	        for(int k = i+1; k < nums.length; k++ ){
	            if(nums[i] < nums[k]){
	               	aux[i] = Math.max(aux[i], aux[k] + 1);
	                count = Math.max(count, aux[i]);
	            }
	        }
	    }
	    return count;
    }
}
