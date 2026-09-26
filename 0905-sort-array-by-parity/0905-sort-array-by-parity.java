class Solution {
    public int[] sortArrayByParity(int[] nums) {
        /*
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(nums[left]%2!=0 && nums[right]%2==0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
            else if(nums[left]%2==0){
                left++;
            }
            else if(nums[right]%2!=0){
                right--;
            }
        }
        return nums;
        */
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }  
        return nums; 
    }
}