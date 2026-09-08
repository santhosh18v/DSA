class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int j=n-1;
        while(j>=0){
            if(digits[j]<9){
                digits[j]=digits[j]+1;
                return digits;
            }
            digits[j]=0;
            j--;   
        }
        int[] arr=new int[n+1];
        arr[0]=1;
        return arr;


        
    }
}