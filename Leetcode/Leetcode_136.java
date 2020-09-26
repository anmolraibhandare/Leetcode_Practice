class Solution {
    public int singleNumber(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];
        
        int element = 0;
        
        Arrays.sort(nums);
        
        int i = 0;
        for(i = 0; i < nums.length-1; i++){
            
            if(nums[i] == nums[i+1])
                i++;
            else
                element = nums[i];         
        }
        if(i == nums.length -1){
            return nums[i];
        }
        
  
        return element;
    }
}
