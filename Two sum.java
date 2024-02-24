class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            Integer n=map.get(val);
            if(n==null){
                map.put(nums[i],i);
            }
            else{
                arr[0]=i;
                arr[1]=n;
            }
        }
        return arr;
    }
}
