class Solution {
    public int reverse(int x) {
        int y = Math.abs(x), rev = 0;
        while(y>0){
            int last = y%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10) return 0;
            rev = rev*10+last;
            y/=10;
        }
        if (x<0)
            return rev*-1;
        return rev;
    }
}
