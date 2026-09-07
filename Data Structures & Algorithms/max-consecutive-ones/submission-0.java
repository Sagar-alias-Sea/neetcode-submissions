class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, large= 0;
        for(int i : nums){
            if(i==1) {
                count++;
                large = (large<count)?count:large;
            }
            if(i==0){
                count = 0;
            }
        }
        return large;
    }
}