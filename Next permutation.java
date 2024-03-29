class Solution {
    public void nextPermutation(int[] nums) {
        
        int n=nums.length;
        int fn=-1;
        int fni=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                fn = nums[i-1];
                fni= i-1;
                break;
            }
        }
        if(fni>=0){
            int j = n-1;
            while(nums[j]<=nums[fni]){
                j--;
            }
            swap(nums,fni,j);
        }
        reverse(nums,fni+1);
    } 
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums, int a ,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
