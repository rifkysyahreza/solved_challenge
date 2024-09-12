class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
		for (String str : sentences){
		    String[] words = str.split(" ");
		    
		    if (words.length > maxCount){
		        maxCount = words.length;
		    }
		    
		}

        return maxCount;
    }
}