class Solution {
    public int maxSubArray(int[] nums) {
        
        
        int maxSumCurr = nums[0];
  int maxSumEnd =nums[0];
        if(nums.length == 1){
            return nums[0];
        }
  for(int i=1;i<nums.length;i++){
      
      maxSumEnd = Math.max(nums[i],maxSumEnd+nums[i]);
      //maxSumEnd =maxSumEnd + nums[i];
      if(maxSumCurr<maxSumEnd){
        maxSumCurr = maxSumEnd;
      }
     

  }
 return maxSumCurr;
    }
}
