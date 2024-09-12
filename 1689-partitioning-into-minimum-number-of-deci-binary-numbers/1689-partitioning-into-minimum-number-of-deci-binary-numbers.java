class Solution {
    public int minPartitions(String n) {
        int currentBiggestNumber = 0;
		for (char ch : n.toCharArray()){
		    if ((ch - '0') > currentBiggestNumber ){
		        currentBiggestNumber = ch - '0';
		    }
		}

        return currentBiggestNumber;
    }
}