class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];
        int maxcount=0;
        
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length; j++){
                
                if(j!=i && nums[j] < nums[i])
                    maxcount++;
    
            }
             count[i] = maxcount;
            maxcount=0;
        }
        return count;
    }
}
