class Solution {
    public int maxArea(int[] height) {
        //area = minHeigth * x
        
        int l = 0;
        int r = height.length - 1;
        int maxArea = 0;
        
        while(l < r){
            int aux = (r-l)* Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, aux);
            
            if(height[l] < height[r])
                l++;
            else
                r--;            
        }
        
        return maxArea;
            
    }
}
