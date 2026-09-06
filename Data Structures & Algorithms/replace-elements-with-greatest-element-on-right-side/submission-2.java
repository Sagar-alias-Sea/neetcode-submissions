class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int large = 0;
        res[arr.length-1] = -1;
        for(int i = arr.length-1; i>0; i-- ){
            if(large < arr[i]){
                large = arr[i];
                res[i-1] = large;
            }else{
                res[i-1] = large;
            }

        }
        return res;
    }
}