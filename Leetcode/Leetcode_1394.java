class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        // initial value is -1 if there is no lucky integer return -1 
        int result = -1;
        
        // Iterate over the input array 
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                //If key exits, then get the value of that key
                // increment/replace oldvalue with current
                int count = map.get(arr[i]);
                count++;
                map.replace(arr[i], count);

            } else {
                // If key does not exist
                // put the key in map and value = 1
                map.put(arr[i], 1);
            }
        }
        
        // Iterate over the hasmap keys
        for(int key:map.keySet()) {
            // check whether value (frequency) is equal to key 
            if(map.get(key)==key) {
                // found lucky number
                if(key>result)
                // If there are multiple lucky integers return the largest of them
                    result=key;
            }
        }
       return result;
    }
}
