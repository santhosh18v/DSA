class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int largest=0;
        int index=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>largest){
                largest=nums[i];
                index=i;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=largest && largest<2*nums[i]){
                return -1;
            }
        }
        return index;
    }
}