class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*
        // Brute Force 
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> triplet=new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        set.add(triplet);
                    }
                    
                }
            }
        }
        return new ArrayList<>(set);

        */

        /*
        // Better Approach
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> hashset=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                if(hashset.contains(third)){
                    List<Integer> triplet=new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(third);
                    Collections.sort(triplet);
                    set.add(triplet);
                }
                hashset.add(nums[j]);
            }
        }
        return new ArrayList<>(set);

        */
        // Optimal Approach
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]== nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[left]+nums[right]+nums[i];
                if(sum<0){
                    left++;
                }
                else if(sum>0){
                    right--;
                }
                else {
                    List<Integer> temp= new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    list.add(temp);
                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                

            }
        }
        return list;
    }
}