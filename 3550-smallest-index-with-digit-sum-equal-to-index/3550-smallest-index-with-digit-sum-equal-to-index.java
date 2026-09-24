class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int extractDigit=nums[i];
            int sum=0;
            while(extractDigit>0){
                int digit=extractDigit%10;
                sum=sum+digit;
                extractDigit=extractDigit/10;
            }
            if(sum==i){
                    return i;
                }
        }
        return -1;
        
    }
}