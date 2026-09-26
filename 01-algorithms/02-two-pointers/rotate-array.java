class Solution {
    public void rotate(int[] nums, int k) {
        /*
            1 2 3 4 5
            5 1 2 3 4
        */
        int length = nums.length;
        k = length - (k % length);
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            int j = i + k;
            if (j >= length) j = j - length;
            temp[i] = nums[j];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = temp[i];
        }
    }
}
