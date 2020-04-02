class Solution {
    public int singleNumber(int[] nums) {
        
        HashSet<Integer> h = new HashSet<Integer>() ;
        
        //for each number in nums, if it can't be added to hashset, it is a dupe; remove it
        for (int i = 0 ; i < nums.length ; i++) {
            if (!h.add(nums[i])) h.remove(nums[i]) ;
        }
        
        //convert hashet of size 1 into array; return 0th element
        return h.toArray(new Integer[1])[0] ;
        
    }
}
