class Solution {
    public int[] runningSum(int[] nums) {
     
        int sum[] = new int[nums.length];
        int sumfornumbers =0;
        
        for(int i =0; i<nums.length;i++){
            sumfornumbers += nums[i];
            sum[i] = sumfornumbers;
        }
        return sum;
    }
}
