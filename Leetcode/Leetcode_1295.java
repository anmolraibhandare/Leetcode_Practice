class Solution {
    public int findNumbers(int[] nums) {
        int count=0,counter=0;
        for (int i=0;i<nums.length;i++) {
            while(nums[i] > 0){
            nums[i]=nums[i]/10;
            counter++;
            }
            if (counter%2 == 0) {
                count++;
            }
            counter=0;
        }
        return count;
    }
}
