class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, large= 0;
        for(int i : nums){

                count = (i==1) ? count+1 : 0;
                large = Math.max(large,count);

        }
        return large;
    }
}