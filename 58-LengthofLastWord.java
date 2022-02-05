class Solution {
    public int lengthOfLastWord(String s) {
        char [] array1 = s.toCharArray();
        String result = "";
        int result1= 0;
        int i = array1.length -1;
        
        for(int l = i; l >= 0; l--) {
            if(array1[l] != ' '){
                result1++;
            }
            else if  (result1 > 0) 
                return result1;
        }
        
        return result1;
    }
}
