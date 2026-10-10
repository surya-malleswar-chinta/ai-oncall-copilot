class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prev[] = new int[n];
        prev[0] = 1;
        for (int i = 1; i < n; i++) {
            prev[i] = prev[i-1]*nums[i-1];
        }
        int back = 1;
        for (int i = n-1; i >= 0; i--) {
            prev[i] = prev[i] * back;
            back = back * nums[i];
        }
        return prev;
    }
}  

