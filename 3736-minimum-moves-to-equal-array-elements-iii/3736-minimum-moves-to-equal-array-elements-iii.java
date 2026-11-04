class Solution {
    public int minMoves(int[] nums) {
        int largest=0;
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i]){
                largest=nums[i];
            }
        }
        int moves=0;
        for(int i=0;i<nums.length;i++){
            moves +=largest-nums[i];
        }
        return moves;
    }
}