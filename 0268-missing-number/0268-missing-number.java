/*class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expected=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return expected-sum;
        
    }
}*/
class Solution{
    public int missingNumber(int[] nums){
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^i;
            xor=xor^nums[i];
        }
        xor=xor^nums.length;
        return xor;
    }
}