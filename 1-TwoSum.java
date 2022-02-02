class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        HashMap<Integer, Integer> auxHash = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            int aux = target - nums[i];
            
            if(auxHash.get(aux) != null){
                if(i <= auxHash.get(aux)){
                    result[0] = i; 
                    result [1] = auxHash.get(aux);
                }
                else{
                    result[0] = auxHash.get(aux); 
                    result [1] = i;
                }                
                return result;
            }

           auxHash.put(nums[i], i);
       }
        return result;
    }
}
