class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        result[0] = 1;

        for (int i = 1; i < nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
            
        }
        
        int right = 1;
        for(int l = nums.length - 1; l >= 0 ; l--){
           result[l] *= right;
            right *= nums[l];
        }
        return result;
    }
}
