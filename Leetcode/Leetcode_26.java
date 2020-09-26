class Solution {
    public int removeDuplicates(int[] nums) {
       
        //if length is 0, no output
        if(nums.length == 0){
            return 0;
        }
        
        int temp = nums[0], j = 0;
        
        for(int i = 0; i < nums.length; i++){
            if (temp == nums[i] && nums.length > 0){
              nums[j] = temp;  
            }else {
                j++;
                nums[j] = nums[i];
                temp = nums[i];
            }  
        }
        return j+1;
    }
}
