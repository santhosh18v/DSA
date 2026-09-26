class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int count=0;
        int []expected=new int[n];
        for(int i=0;i<n;i++){
            expected[i]=heights[i];
        }
        /*
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(expected[j]>expected[j+1]){
                    int temp=expected[j];
                    expected[j]=expected[j+1];
                    expected[j+1]=temp;
                }
            }
        }
        */
        Arrays.sort(expected);
        
        for(int i=0;i<n;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
}