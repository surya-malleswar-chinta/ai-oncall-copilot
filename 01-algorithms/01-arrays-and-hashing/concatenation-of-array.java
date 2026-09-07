class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] solution = new int[2*length];
        for (int i = 0; i < length; i++) {
            solution[i] = solution[i+length] = nums[i];
        }

        return solution;
    }
}
