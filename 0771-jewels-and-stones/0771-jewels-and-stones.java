class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
		for (char chStone : stones.toCharArray()){
		    for(char chJewels : jewels.toCharArray()){
		        if (chJewels == chStone){
		            count++;
		        }
		    }
		}

        return count;
    }
}