class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int temp = 0;
        for (String str : operations){
            
            // check if the string is decrements
            if (str.toLowerCase().equals("--x") || str.toLowerCase().equals("x--")){
                temp--;
            }
            
            // check if the string is increments
            if (str.toLowerCase().equals("++x") || str.toLowerCase().equals("x++")){
                temp++;
            }
        }
        
        return temp;
    }
}