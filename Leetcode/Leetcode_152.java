class Solution {
    public int maxProduct(int[] nums) {
        // KADANE Algo
        
        int N = nums.length;
        
        if(N == 0) return 0;

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        
        for(int i = 1 ; i < N ; i++){
            
            int current = nums[i];
            
            int tempMax = Math.max(current, Math.max(max * nums[i], min * nums[i]));
            
            min = Math.min(current, Math.min(max * nums[i], min * nums[i]));
            
            max = tempMax;
            
            result = Math.max(result, max);
           
        }
     return result;
    }
}
