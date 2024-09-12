class Solution {
    public String convertDateToBinary(String date) {
        String[] words = date.split("-");
		
		for (int i = 0; i < words.length; i++){
		      words[i] = Integer.toBinaryString(Integer.parseInt(words[i]));
		}

        return String.join("-", words);
    }
}