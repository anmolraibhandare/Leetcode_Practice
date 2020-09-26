class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        // Approach 1
        
//         for(int i = 0; i < nums.length; i++){
            
//             for(int j = i+1 ; j<nums.length; j++){
            
//                 if(nums[i] == nums[j]){
//                     return true;
//                 } 
//             }
//         }
//         return false;
        
        
        //Approach 2
        
//         Arrays.sort(nums);
        
//         for(int i = 0; i < nums.length - 1; i++) {
//             if(nums[i] == nums[i+1]) 
//                 return true;
//         }
//         return false;
        
        //Approach 3
        
        Set<Integer> set = new HashSet<>(nums.length);
        
        for(int x: nums) {
            if(set.contains(x)) 
                return true;
            set.add(x);
        }
        return false;
          
    }
}
