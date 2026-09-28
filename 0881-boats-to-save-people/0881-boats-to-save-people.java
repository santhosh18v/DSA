class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        int boats=0;
        Arrays.sort(people);
        int left=0;
        int right=n-1;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                boats++;
                left++;
                right--;
            }
            else if(people[left]+people[right]>limit){
                boats++;
                right--;
            }
        }
        return boats;
        
    }
}