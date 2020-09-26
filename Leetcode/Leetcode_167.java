class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result= new int[2];
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]==target-numbers[i]){
                    result=new int[]{i+1,j+1};
                }
            }
        }
        return result;
    }
}
