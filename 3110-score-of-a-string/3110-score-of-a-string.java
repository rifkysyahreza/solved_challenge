class Solution {
    public int scoreOfString(String s) {
        char[] stringToChar = s.toCharArray();
        
        int temp = 0;
        for (int i = 0; i < s.length() - 1; i++){
            temp += Math.abs(stringToChar[i]-stringToChar[i+1] );
        }
        
        return temp;
    }
}