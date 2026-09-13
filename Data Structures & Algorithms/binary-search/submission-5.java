class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int mid = (int)((low+high)/2);

        while(low<=high){
            
            if(nums[mid] == target)
                return mid;
            
            if(target>nums[mid]){
                low = mid+1;
            }
            
            if(target<nums[mid]){
                high = mid-1;
            }
            mid = (int)((low+high)/2);
        }
        return -1;
    }
}
