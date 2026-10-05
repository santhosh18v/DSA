class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result=new int[nums.length];
        int k=0;
        for(int i=0;i<n;i++){
                result[k]=nums[i];
                result[k+1]=nums[i+n];
                k +=2;
        }
        return result;
    }
}