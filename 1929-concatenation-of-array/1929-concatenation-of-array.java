class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newNumsLength = new int[nums.length*2];

        System.arraycopy(nums, 0 ,newNumsLength, 0, nums.length);
        System.arraycopy(nums, 0 ,newNumsLength, nums.length, nums.length);

        System.out.println(Arrays.toString(newNumsLength));
        return newNumsLength;
    }
}