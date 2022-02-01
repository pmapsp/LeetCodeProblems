class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for(int n = 0; n < nums.length; n++){
            if(nums[n] != val){
                nums[counter++] = nums[n];
            }
        }
        return counter;
    }
}
