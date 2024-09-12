class Solution {
    public int subtractProductAndSum(int n) {
        String[] arrayOfString = String.valueOf(n).split("");
	    
	    int sum = 0;
	    int multiply = 1;
	    for (String num : arrayOfString){
	        sum += Integer.parseInt(num);
	        multiply *= Integer.parseInt(num);
	    }

        return (multiply - sum);
    }
}