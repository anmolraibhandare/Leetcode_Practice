class Solution {
    public int[] productExceptSelf(int[] nums) {
       
//         int[] productArray = new int[nums.length];
        
//         // Traverse through array to find if i==j and skip that element 
        
//         for(int i = 0 ; i < nums.length; i++){
//             productArray[i] = 1;   
//         }
//         for(int i = 0; i < nums.length; i++){
//             for(int j = 0; j < nums.length; j++){
//                 if(i != j){
//                     productArray[i] *= nums[j];
//                 }
//             }
//         }
//         return productArray;
        
        
//         int N = nums.length;
        
//         int[] leftArray = new int[N];
//         int[] rightArray = new int[N];
        
//         int[] productArray = new int[N];
        
        
//         leftArray[0] = 1;
//         rightArray[N-1] = 1;
        
//         for(int i = 1; i < N ; i++){
//             leftArray[i] = leftArray[i-1] * nums[i-1];
//         }
//         for(int i = N-2; i >= 0 ; i--){
//             rightArray[i] = rightArray[i+1] * nums[i+1];
//         }
//         for(int i = 0; i < N ; i++){
//             productArray[i] = leftArray[i] * rightArray[i];
//         }
        
//         return productArray;
        
        
        int N = nums.length;
        
        int[] productArray = new int[N];
        
        
        productArray[0] = 1;
        int R = 1;
        
        for(int i = 1; i < N ; i++){
            productArray[i] = productArray[i-1] * nums[i-1];
        }
        for(int i = N-1; i >= 0 ; i--){
            productArray[i] = nums[i] * R;
            R *= nums[i];
        }
        
        return productArray;
        
    }
}
