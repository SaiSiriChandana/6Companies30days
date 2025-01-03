class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isIncreasingSubArray(nums,i,j)){
                    cnt++;
                }
            }
        }
        return cnt;
        
    }
    public boolean isIncreasingSubArray(int[] nums,int start,int end){
        int n=nums.length;
        int prev=0;
        for(int i=0;i<n;i++){
            if(i<=end&&i>=start){
                continue;
            }
            if(nums[i]<=prev){
                return false;

            }
            prev=nums[i];
        }
        return true;
    }
}
