class Solution {
    public int[] productExceptSelf(int[] nums) {
        /* Brute Force
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    product *= nums[j];
                }
            }
            result[i]=product;

        }
        
        return result;
        */
        /*
        // Optimal Approach
        int n=nums.length;
        int[] result=new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=result[i-1]*nums[i-1];
        }
        int rightProduct=1;
        for(int j=n-1;j>=0;j--){
            result[j] *= rightProduct;
            rightProduct *=nums[j];
        }
        return result;
        */
        int n=nums.length;
        int[] result=new int[n];
        int leftProduct=1;
        for(int i=0;i<n;i++){
            result[i]=leftProduct;
            leftProduct *=nums[i];
        }
        int rightProduct=1;
        for(int j=n-1;j>=0;j--){
            result[j] *=rightProduct;
            rightProduct *= nums[j];

        }
        return result; 

    }
}