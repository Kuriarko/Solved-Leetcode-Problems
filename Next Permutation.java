class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <=1) return;
        int i= nums.length - 2;
        while(i>=0 && nums[i+1] <= nums[i]) i--;
        
        if(i>=0){
            int j = nums.length-1;
            while(nums[j] <= nums[i]) j--;
            swap(nums,i,j);
        }

        reverse(nums,i+1,nums.length-1);
    }

    private int[] reverse(int[] nums, int i, int j){
        while(i <= j){
            swap(nums,i,j);
            i++;
            j--;
        }

        return nums;
    }

    private int[] swap(int[] nums, int i, int j){
        int  x = nums[i];
        nums[i]= nums[j];
        nums[j] = x;

        return nums;
    }
}