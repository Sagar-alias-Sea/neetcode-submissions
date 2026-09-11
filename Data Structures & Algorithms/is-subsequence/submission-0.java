class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0, idx = 0;

        for(int i = 0; i<s.length(); i++){

            int found = 0;

            while(j<t.length()){

                if(s.charAt(i) == t.charAt(j)){
                    found = 1; j++;
                    break;
                }else 
                    found = 0;
                j++;
            }
            if(j==t.length() && found == 0)
                return false;
        }
        return true;
        
    }
}