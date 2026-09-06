class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int large = arr[len-1], i = len - 2;

        arr[len-1] = -1;
        while(i>=0){
            int temp = arr[i];
            arr[i] = large;
            if(temp>large)
                large = temp;
            i--;
        }
        return arr;
    }
}