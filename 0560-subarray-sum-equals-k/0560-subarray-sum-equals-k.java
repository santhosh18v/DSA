class Solution {
    public int subarraySum(int[] nums, int k) {
        /*
        --- Brute Force ---
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==k){
                    count++;
                }

            }
        }
        return count;
        */
        int count=0;
        int prefixSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixSum +=nums[i];
            if(map.containsKey(prefixSum-k)){
                count+=map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

        }
        return count;
    }
}