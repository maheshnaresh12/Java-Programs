class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> mapper = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(mapper.containsKey(nums[i])){
                
             mapper.put(nums[i],mapper.get(nums[i])+1);
                
           if(mapper.get(nums[i]) >nums.length/2) return nums[i];
                
            }
            else{
                mapper.put(nums[i],1);
            }
            
            }
        
        return nums[0];

     
    }
    
}
