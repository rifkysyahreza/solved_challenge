class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> listOfResult = new ArrayList<>();

        for (int i = 0; i < words.length; i++){
		    if (words[i].contains(String.valueOf(x))){
		        listOfResult.add(i);
		    }
		}

        return listOfResult;
    }
}