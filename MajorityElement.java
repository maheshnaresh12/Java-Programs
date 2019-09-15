Majority Element:

class Solution {
    public int majorityElement(int[] nums) {
        
        int count =0;
        int number =0;
        int tempCount =0;
        for(int i=0;i<nums.length;i++){
             tempCount =0;
            if(number != nums[i]){
            for(int j =0;j<nums.length;j++){
               
                if(nums[i]==nums[j]){
                    tempCount++;
                }
                   
            }
            }
            
            if(count<tempCount){
                    count =tempCount;
                    number = nums[i];
                }
                
        
        }
        
        return number;
     
    }
    
}

