class Solution {
    public int differenceOfSum(int[] nums) {
        int[] number = nums;
	    ArrayList<String> numberInString = new ArrayList<String>();
	    String arrayNumberJoin = "";
	    
	    int sum = 0;
	    for (int num : number){
	        sum += num; 
	        numberInString.add(Integer.toString(num));
	    }
	    
	    arrayNumberJoin = String.join("", numberInString);
	    int[] number2 = new int[arrayNumberJoin.length()];
	    
	    int index = 0;
	    for (char ch : arrayNumberJoin.toCharArray()){
	        number2[index] = ch - '0'; 
	        index++;
	    }
	    
	    int multiply = 0;
	    for (int i : number2){
	        multiply += i;
	    }
	    
	    int result = Math.abs(sum - multiply);
	    
	    return result;
    }
}