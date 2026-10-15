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
    
    }
}