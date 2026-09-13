class Solution {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length-1;

        while(l <= h){
            
        int mid = l + ((h - l) / 2); 
        /* we are doing this bc it will handle overflow condition of integer.
        while we doing the (l+h)/2 to find mid, if the h is Integer.MAX_VALUE
        and the h will get add by some l value (to find mid) - then the overflow
        condition will come. so DO THIS instead!*/
            
            if(target > nums[mid]){
                l = mid+1;
            }
            else if(target < nums[mid]){
                h = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
