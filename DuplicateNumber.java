class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> duplicates = new HashSet<>(nums.length);
        
        for(int i:nums){
            
            if(duplicates.contains(i)){
                
                return true;
            }
            else {
                
                duplicates.add(i);
            }
        }
      return false;  
    }
}
